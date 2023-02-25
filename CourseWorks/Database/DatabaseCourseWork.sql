create database Aircompany;
use Aircompany;

create table Pilot(
	PilotID int auto_increment not null primary key,
    PilotName varchar(60) not null
);

create table Aircraft(
	AircraftID int auto_increment not null primary key,
    AircraftModel varchar(60) not null
);

create table Food(
	FoodID int auto_increment not null primary key,
    FoodName varchar(60) not null
);

create table Flights(
	FlightID int auto_increment not null primary key,
	FlightDate date not null,
	FlightDepartTime time not null,
	FlightDuration time not null,
	FlightStartAirport varchar(60) not null,
	FlightEndAirport varchar(60) not null
	/*
    FlightAircraft int not null,
	FlightPilot int not null,
	FlightFoodType int not null,
    foreign key(FlightPilot) references Pilot(PilotID),
    foreign key(FlightAircraft) references Aircraft(AircraftID)
    foreign key(FlightFoodType) references Food(FoodID)
    */
);

/* Pilot to Flight M:M Connection Table */
create table PilotToFlight(
	ID int not null auto_increment primary key,
	PilotID int not null, 
    FlightID int not null,
    /*primary key(Flight,PilotID,FlightID),*/
    foreign key(PilotID) references Pilot(PilotID),
    foreign key(FlightID) references Flights(FlightID)
);

/* Aircraft to Flight M:M Connection Table */
create table AircraftToFlight(
	AircraftID int not null,
    FlightID int not null,
    primary key(AircraftID,FlightID),
    foreign key(AircraftID) references Aircraft(AircraftID),
    foreign key(FlightID) references Flights(FlightID)
);

/* Food to Flight M:M Connection Table */
create table FoodToFlight(
	FoodID int not null,
    FlightID int not null,
    primary key(FoodID,FlightID),
    foreign key(FoodID) references Food(FoodID),
    foreign key(FlightID) references Flights(FlightID)
);


/* Наряди на пилоти - Pilots' Shifts */
create table PilotShift(
	PilotID int not null,
	PilotShiftStartTime datetime not null,
    PilotShiftEndTime datetime not null,
    primary key(PilotID,PilotShiftStartTime,PilotShiftEndTime)
);


/* Заместване на пилот - Replace Pilot */
create table ReplacePilot(
	FlightDate date not null,
	PilotToReplaceID int not null,
    ReplacePilotID int not null,
    primary key(FlightDate, PilotToReplaceID, ReplacePilotID),
    foreign key(PilotToReplaceID) references Pilot(PilotID),
    foreign key(ReplacePilotID) references Pilot(PilotID)
);


