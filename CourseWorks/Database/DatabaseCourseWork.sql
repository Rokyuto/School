CREATE DATABASE Airline;
USE Airline;
CREATE TABLE Flights(FlightID INT NOT NULL,
					FlightAirline VARCHAR(60) NOT NULL,
					FlightDate VARCHAR(20) NOT NULL,
					FlightTime VARCHAR(20) NOT NULL,
					FlightDuration DOUBLE NOT NULL,
					FlightStartAirport VARCHAR(60) NOT NULL,
					FlightEndAirport VARCHAR(60) NOT NULL,
					FlightPlane VARCHAR(40) NOT NULL,
					FlightPilot VARCHAR(60) NOT NULL,
					FlightFoodType VARCHAR(60) NOT NULL,
					PRIMARY KEY(FlightID));