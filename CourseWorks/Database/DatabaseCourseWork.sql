CREATE DATABASE Airline;
USE Airline;
CREATE TABLE Flights(/*FlightID INT AUTO_INCREMENT NOT NULL,*/
					FlightAirline VARCHAR(60) NOT NULL,
					FlightDate DATE NOT NULL,
					FlightTime TIME NOT NULL,
					FlightDuration TIME NOT NULL,
					FlightStartAirport VARCHAR(60) NOT NULL,
					FlightEndAirport VARCHAR(60) NOT NULL,
					FlightAircraft VARCHAR(40) NOT NULL,
					FlightPilot VARCHAR(60) NOT NULL,
					FlightFoodType VARCHAR(60) NOT NULL);
					/*PRIMARY KEY(FlightID));