import java.util.*;

public class CoffeeMachineApp {

    Drink cappuccino, hotChocolate, tea;
    ArrayList<Drink> drinks;

    Coin coin1, coin2,coin3,coin4,coin5;
    ArrayList<Coin> coins;

    int sugarPower;
    Product sugar, coffee, teaHerb, chocolate, water, cup, stirrer;
    Product[] products;

    Drink wantedDrink;
    float wantedDrinkPrice;
    ArrayList<Coin> coinsRemainder;

    double[] wantedDrinkProductsRequirements;

    static CoffeeMachineApp machine;

    public static void main(String[] args) {
        machine = new CoffeeMachineApp();
        machine.machineStartup();
    }

    public void machineStartup(){

        sugar = new Product("Sugar", 0);
        coffee = new Product("Coffee", 10);
        chocolate = new Product("Chocolate", 10);
        teaHerb = new Product("Tea", 150);
        water = new Product("Water", 100);
        cup = new Product("Cup", 1000);
        stirrer = new Product("Stirrer", 1000);
        products = new Product[]{sugar, water, cup, stirrer};

        cappuccino = new Drink( "cappuccino", 0.75F, 5, 2,coffee);
        hotChocolate = new Drink("Hot Chocolate", 0.50F, 5, 5,chocolate);
        tea = new Drink("tea", 0.30F, 7, 4,teaHerb);
        drinks = new ArrayList<>();

        coin1 = new Coin(1.0F,50);
        coin2 = new Coin(0.50F,0);
        coin3 = new Coin(0.20F,10);
        coin4 = new Coin(0.10F,10);
        coin5 = new Coin(0.05F,10);
        coins = new ArrayList<>();

        sugarPower = 0;

        coinsRemainder = new ArrayList<>();

        drinks.add(cappuccino);
        drinks.add(hotChocolate);
        drinks.add(tea);

        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        clientChooseDrink(1);

    }

    // Method called when client press button with drink
    public void clientChooseDrink(int index) {//int index
        wantedDrink = drinks.get(index);
        wantedDrinkPrice = wantedDrink.getPrice();
        checkProducts();
    }

    public void checkProducts() {
        boolean isProductEnough;
        wantedDrinkProductsRequirements = new double[]{sugarPower, wantedDrink.getWaterMils(), 1,1};

        for (int i = 0; i < products.length - 1; i++) {
            isProductEnough = products[i].getQuantity() >= wantedDrinkProductsRequirements[i];
            if (!isProductEnough){
                errorOccurred(i);
                if (i == 0){
                    i = -1; // Return with 1 step backward
                }
            }
        }
        if (checkDrinkGrams()){
            collectPrice(wantedDrinkPrice);
        }
    }

    public boolean checkDrinkGrams() {

        if (wantedDrink.getDrinkBase().getQuantity() > wantedDrink.getDrinkGrams()){
            wantedDrink.getDrinkBase().setQuantity(wantedDrink.getDrinkBase().getQuantity() - wantedDrink.getDrinkGrams());
        }
        else {
            errorOccurred(5);
            return false;
        }

        return true;
    }

    // Method to collect all entered from the client coins
    public static void collectPrice(double coffeePrice) {
        Scanner debugInput = new Scanner(System.in);
        double totalSum = 0.0;
        while (totalSum < coffeePrice) {
            totalSum += machine.clientPutCoin(debugInput.nextDouble());
        }
        if (totalSum > coffeePrice) {
            machine.returnRemainder((float)(totalSum - coffeePrice)); // will return list with coins
            for (Coin currentCoin : machine.coinsRemainder){
                System.out.println("Remainder: " + currentCoin.getValue());
            }
        }
        machine.makeDrink();
    }

    // Method to get the entered from Client Coin
    public double clientPutCoin(double coinValue) {
        Coin enteredCoin = new Coin((float)coinValue,1); // Coins count > 1 rework
        for (Coin currentCoin : coins) {
            if (currentCoin.getValue() == enteredCoin.getValue()) {
                currentCoin.setCount(currentCoin.getCount() + 1);
                return enteredCoin.getValue();
            }
        }
        // check if the coin is suitable with requirements (coins which the machine uses)
        errorOccurred(10);
        return 0;
    }

    // Method to return coins remainder to the client
    public void returnRemainder(float sumToReturn) {
        int coinIndex = 0;
        coinsRemainder.clear();
        // GREEDY ALGORITHM
        while (sumToReturn > 0 && coinIndex < coins.size()) {
            if (coins.get(coinIndex).getCount() > 0) {
                float currentCoinValue = coins.get(coinIndex).getValue();
                if (sumToReturn - currentCoinValue >= 0) {
                    sumToReturn -= currentCoinValue;
                    coins.get(coinIndex).setCount(coins.get(coinIndex).getCount() - 1);
                    coinsRemainder.add(coins.get(coinIndex));
                } else {
                    coinIndex++;
                }
            } else {coinIndex++;}
        }
        if (coinsRemainder.size() == 0) {
            System.out.println("DEBUG PRINT:: Can't return the sum: " + sumToReturn);
            errorOccurred(11);
        }
    }

    // Change sugar Quantity when client click sugar button | Change by 1 power
    public int changeSugarPower(int index) {
        // Check Sugar Quantity
        if (index == 0) { // Decrease Sugar Power
            if (sugarPower > 0) {sugarPower--;}
        } else { // Increase Sugar
            if (sugarPower < 5) {sugarPower++;}
        }
        return sugarPower;
    }

    public Drink makeDrink() {
        wantedDrink.setSugarQuantity(sugarPower);
        sugar.setQuantity(sugar.getQuantity() - sugarPower);
        cup.setQuantity(cup.getQuantity() - 1);
        water.setQuantity(water.getQuantity() - wantedDrink.getWaterMils());
        stirrer.setQuantity(stirrer.getQuantity() - 1);
        System.out.println("Order proceeded");
        System.out.println("Here is your : " + wantedDrink.getName());
        return wantedDrink;
    }

    // Method to print errors
    public void errorOccurred(int errorIndex) {
        switch (errorIndex) {
            // Products Errors
            case 0 -> {
                System.out.println("Not Enough Sugar. Try again with lower sugar level");
                changeSugarPower(0);
                wantedDrinkProductsRequirements[0] = sugarPower;
            }
            case 1 -> {
                System.out.println("The water in the machine has finished | Can't make Drink");
            }
            case 2 -> {
                System.out.println("The cups in the machine have finished | Can't make Drink");
            }
            case 3 -> {
                System.out.println("The stirrers in the machine have finished | Can't make Drink");
            }
            case 5 -> {
                System.out.println("The chosen drink is sold out");
            }
            case 10 -> System.out.println("The machine do not work with this type of coin");
            case 11 -> System.out.println("Do not have right coin to return, can't return the full sum");
        }
    }

    class Drink {
        private String name;
        private float price;
        private int sugarPower;
        private int waterMils;
        private int drinkGrams; // Grams coffee or tea
        private Product drinkBase;

        Drink(String name, float price, int waterMilliliters, int drinkGrams,Product base) {
            this.name = name;
            this.price = price;
            this.sugarPower = 0;
            this.waterMils = waterMilliliters;
            this.drinkGrams = drinkGrams;
            this.drinkBase = base;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public int getSugarQuantity() {
            return sugarPower;
        }

        public void setSugarQuantity(int sugar) {
            this.sugarPower = sugar;
        }

        public int getWaterMils() {
            return waterMils;
        }

        public void setWaterMils(int waterMilliliters) {
            this.waterMils = waterMilliliters;
        }

        public int getDrinkGrams() {
            return drinkGrams;
        }

        public void setDrinkGrams(int drinkGrams) {
            this.drinkGrams = drinkGrams;
        }

        public Product getDrinkBase() {
            return drinkBase;
        }

        public void setDrinkBase(Product drinkBase) {
            this.drinkBase = drinkBase;
        }
    }

    class Coin {
        private float value;
        private int coinCount;

        Coin(float value,int coinCount) {
            this.value = value;
            this.coinCount = coinCount;
        }

        public float getValue() {
            return value;
        }

        public void setValue(float value) {
            this.value = value;
        }

        public int getCount() {
            return coinCount;
        }

        public void setCount(int count) {
            this.coinCount = count;
        }
    }

    class Product {
        private String type;
        private double quantity; // Grams / pieces

        Product(String type, double quantity) {
            this.type = type;
            this.quantity = quantity;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public double getQuantity() {
            return quantity;
        }

        public void setQuantity(double quantity) {
            this.quantity = quantity;
        }
    }

}
