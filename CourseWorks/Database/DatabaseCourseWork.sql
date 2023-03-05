create database IF NOT EXISTS Aircompany;
use Aircompany;

create table IF NOT EXISTS Pilot(
	PilotID int auto_increment not null primary key,
    PilotName varchar(60) not null
);

create table IF NOT EXISTS Aircraft(
	AircraftID int auto_increment not null primary key,
    AircraftModel varchar(60) not null
);

create table IF NOT EXISTS Food(
	FoodID int auto_increment not null primary key,
    FoodName varchar(60) not null
);

create table IF NOT EXISTS Flights(
	FlightID int auto_increment not null primary key,
	FlightDate date not null,
	FlightDepartTime time not null,
	FlightDuration time not null,
	FlightStartAirport varchar(60) not null,
	FlightEndAirport varchar(60) not null
);

/* Pilot to Flight M:M Connection Table */
create table IF NOT EXISTS PilotToFlight(
	ID int not null auto_increment primary key,
	PilotID int not null, 
    FlightID int not null,
    /*primary key(Flight,PilotID,FlightID),*/
    foreign key(PilotID) references Pilot(PilotID),
    foreign key(FlightID) references Flights(FlightID)
);

/* Aircraft to Flight M:M Connection Table */
create table IF NOT EXISTS AircraftToFlight(
	AircraftID int not null,
    FlightID int not null,
    primary key(AircraftID,FlightID),
    foreign key(AircraftID) references Aircraft(AircraftID),
    foreign key(FlightID) references Flights(FlightID)
);

/* Food to Flight M:M Connection Table */
create table IF NOT EXISTS FoodToFlight(
	FoodID int not null,
    FlightID int not null,
    primary key(FoodID,FlightID),
    foreign key(FoodID) references Food(FoodID),
    foreign key(FlightID) references Flights(FlightID)
);

/* Наряди на пилоти - Pilots' Shifts */
create table IF NOT EXISTS PilotShift(
	PilotID int not null,
	PilotShiftStartTime datetime not null,
    PilotShiftEndTime datetime not null,
    primary key(PilotID,PilotShiftStartTime,PilotShiftEndTime),
    foreign key(PilotID) references Pilot(PilotID)
);

/* Заместване на пилот - Replace Pilot */
create table IF NOT EXISTS ReplacePilot(
	Date date not null,
	PilotToReplaceID int not null,
    ReplacePilotID int not null,
    primary key(Date, PilotToReplaceID, ReplacePilotID),
    foreign key(PilotToReplaceID) references Pilot(PilotID),
    foreign key(ReplacePilotID) references Pilot(PilotID)
);
