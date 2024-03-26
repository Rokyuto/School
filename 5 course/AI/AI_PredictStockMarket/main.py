import numpy as np
import time as tm
import datetime as dt
import tensorflow as tf

print(tf.__version__)

# Data preparation
from yahoo_fin import stock_info
from sklearn.preprocessing import MinMaxScaler
from collections import deque

# AI
from keras.models import Sequential
from keras.layers import Dense, LSTM, Dropout

# Graphics library
import matplotlib.pyplot as plt

N_DAYS = 7  # Number of days (7) = 1 week (sequence)
LOOKUP_DAYS = [1, 2, 3]  # Days for which the model will predict (1 = tomorrow, 2 = after tomorrow, 3 = day after the second day)
STOCK = 'GOOGL'  # Ticker of the market
date_now = tm.strftime('%Y-%m-%d')  # Today's date, formatted
date_3_years_back = (dt.date.today() - dt.timedelta(days=1104)).strftime('%Y-%m-%d')  # The same day 3 years ago, formatted

# Load (Collect) the Data
init_dataframe = stock_info.get_data(STOCK, start_date=date_3_years_back, end_date=date_now, interval='1d')  # Load data from Yahoo Finance for every day in the last 3 years
print(init_dataframe)  # Visualize Loaded Data

used_df_variables = init_dataframe.drop(["open", "high", "low", "adjclose", "volume", "ticker"], axis=1)  # Retrieve only useful predictor variable by dropping (removing) the others
used_df_variables['date'] = used_df_variables.index
# print(used_df_variables)  # Visualize the new Data Frame (Remain only the Date and 'Close' which is the price on the closing market for the day)

# Visualize the data graphically
plt.style.use(style='ggplot')
plt.figure(figsize=(16, 10))
days_count_to_visualize = 1104
plt.plot(used_df_variables['close'][-days_count_to_visualize:])  # Content of the Graph
plt.xlabel("Day")
plt.ylabel("Closing Price")
plt.legend([f'Price for {STOCK}'])
plt.show()

scaler = MinMaxScaler()
used_df_variables['close'] = scaler.fit_transform(np.expand_dims(used_df_variables['close'].values, axis=1))  # Normalize (Scale) the 'close' data to have value in range [0-1]. Gives better efficacy
print("used_df_variables: ", used_df_variables)


# Function to divide the input data into X and Y TRAIN DATA
def PrepareData(days):
    df = used_df_variables.copy()  # Create new Data Frame - Copy of the used in the Plot
    df['future'] = df['close'].shift(-days)  # Create 'Future' Column for every of the days which are given to the function
    last_sequence = np.array(df[['close']].tail(days))  # Get the last X (X = num of days for which we want to predict) entities/days
    df.dropna(inplace=True)  # Remove NaN entities
    sequence_data = []  # Entry Data sort as weeks
    sequences = deque(maxlen=N_DAYS)  # Define List to build a week

    for entry, target in zip(df[['close'] + ['date']].values, df['future'].values):  # Iterate the data set
        sequences.append(entry)  # Append entry (day), until there are 7 stored days
        if len(sequences) == N_DAYS:
            sequence_data.append([np.array(sequences), target])  # Append the week and the future in 1 element in the array

    last_sequence = list([s[:len(['close'])] for s in sequences]) + list(last_sequence)  # Iterate from the tail (get the last week (sequence))
    print("Last Sequence with For: ", last_sequence)
    last_sequence = np.array(last_sequence).astype(np.float32)  # Do predictions for future days based on the last sequence (week)

    # Define Predictor Variable Data (X, sequence (week 'close')) and Output Data (Y, target price)
    X, Y = [], []
    for seq, target in sequence_data:
        X.append(seq)
        Y.append(target)

    # Convert elements to be in one (not separated)
    X = np.array(X)
    Y = np.array(Y)

    return df, last_sequence, X, Y


# Define and Train Model
def TrainModel(x_train, y_train):
    # Define ML Model
    model = Sequential()
    model.add(LSTM(60, return_sequences=True, input_shape=(N_DAYS, len(['close']))))  # LSTM Layer with 60 neurons
    model.add(Dropout(0.3))  # Medium Dropout layer with 30% of dropped neurons
    model.add(LSTM(120, return_sequences=False))  # Add LSTM layer with 120 neurons
    model.add(Dropout(0.3))  # Medium Dropout layer with 30% of dropped
    model.add(Dense(20))  # Dense Layer with 20 neurons
    model.add(Dense(1))  # Final Dense Layer with 1 NEURON FOR THE OUTPUT

    BATCH_SIZE = 8  # Group of 8 entities
    EPOCHS = 80  # Computations

    model.compile(loss='mean_squared_error', optimizer='adam')  # Set default parameters for the model (ADJUST THE ML MODEL)
    model.fit(x_train, y_train, batch_size=BATCH_SIZE, epochs=EPOCHS, verbose=1)  # Train the model and Summarize the result

    model.summary()

    return model


# PREDICTIONS
predictions = []

# Iterate X times to make predictions for X days toward
for step in LOOKUP_DAYS:
    df, last_sequence, x_train, y_train = PrepareData(step)
    x_train = x_train[:, :, :len(['close'])].astype(np.float32)  # Keep only the predictor variable ('close')

    model = TrainModel(x_train, y_train)  # Train Model

    last_sequence = last_sequence[-N_DAYS:]  # Get the last week (sequence)
    last_sequence = np.expand_dims(last_sequence, axis=0)  # Increase the dimension of the array (+1)
    prediction = model.predict(last_sequence)  # Make Prediction
    predicted_price = scaler.inverse_transform(prediction)[0][0]  # Inverse scale (remove the range board) to give the proper price

    predictions.append(round(float(predicted_price), 2))  # Round the result to 2nd digit and APPEND it to the PREDICTIONS array

# Print predictions
if bool(predictions) == True and len(predictions) > 0:
    predictions_list = [str(d) + '$' for d in predictions]
    predictions_str = ', '.join(predictions_list)
    message = f'{STOCK} prediction for upcomming {len(LOOKUP_DAYS)} days ({predictions_str})'

    print(message)

# Execute model for the whole history range
copy_df = init_dataframe.copy()
y_predicted = model.predict(x_train)
y_predicted_transformed = np.squeeze(scaler.inverse_transform(y_predicted))
first_seq = scaler.inverse_transform(np.expand_dims(y_train[:6], axis=1))
last_seq = scaler.inverse_transform(np.expand_dims(y_train[-3:], axis=1))
y_predicted_transformed = np.append(first_seq, y_predicted_transformed)
y_predicted_transformed = np.append(y_predicted_transformed, last_seq)
copy_df[f'predicted_close'] = y_predicted_transformed

# Add predicted results to the table
date_today = dt.date.today()
date_tomorrow = dt.date.today() + dt.timedelta(days=1)
date_after_tomorrow = dt.date.today() + dt.timedelta(days=2)
print(copy_df)

# Result chart
plt.style.use(style='ggplot')
plt.figure(figsize=(16,10))
plt.plot(copy_df['close'][-150:].head(147))
plt.plot(copy_df['predicted_close'][-150:].head(147), linewidth=1, linestyle='dashed')
plt.plot(copy_df['close'][-150:].tail(4))
plt.xlabel('days')
plt.ylabel('price')
plt.legend([f'Actual price for {STOCK}',
            f'Predicted price for {STOCK}',
            f'Predicted price for future 3 days'])
plt.show()
