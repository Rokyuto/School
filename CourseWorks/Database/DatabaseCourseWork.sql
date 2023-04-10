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

create table Airports(
	AirportID int auto_increment not null primary key,
    Airport varchar(60) not null
);

create table Flights(
	FlightID int auto_increment not null primary key,
	FlightDate date not null,
	FlightDepartTime time not null,
	FlightDuration time not null,
	FlightStartAirport int not null,
	FlightEndAirport int not null,
    FlightAircraft int not null,
    FlightPilot int not null,
    FlightFood int not null,
    foreign key(FlightStartAirport) references Airports(AirportID),
    foreign key(FlightEndAirport) references Airports(AirportID),
    foreign key(FlightAircraft) references Aircraft(AircraftID),
    foreign key(FlightPilot) references Pilot(PilotID),
    foreign key(FlightFood) references Food(FoodID)
);

/* Наряди на пилоти - Pilots' Shifts */
create table PilotShift(
	PilotID int not null,
	PilotShiftStartTime datetime not null,
    PilotShiftEndTime datetime not null,
    primary key(PilotID,PilotShiftStartTime,PilotShiftEndTime),
    foreign key(PilotID) references Pilot(PilotID)
);

/* Заместване на пилот - Replace Pilot */
create table ReplacePilot(
	ReplaceDate date not null,
	PilotToReplaceID int not null,
    ReplacePilotID int not null,
    primary key(ReplaceDate, PilotToReplaceID, ReplacePilotID),
    foreign key(PilotToReplaceID) references Pilot(PilotID),
    foreign key(ReplacePilotID) references Pilot(PilotID)
);
