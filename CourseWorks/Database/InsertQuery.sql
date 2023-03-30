use aircompany;

INSERT INTO `aircompany`.`flights` (`FlightID`, `FlightDate`, `FlightDepartTime`, `FlightDuration`, `FlightStartAirport`, `FlightEndAirport`) 
VALUES ('6', '2023-03-30', '21:45', '01:30:00', 'Berlin', 'Vienna');

INSERT INTO `aircompany`.`aircrafttoflight` (`AircraftID`, `FlightID`) VALUES ('7', '6');

INSERT INTO `aircompany`.`aircraft` (`AircraftID`, `AircraftModel`) VALUES ('9', 'Airbus A331');

INSERT INTO `aircompany`.`food` (`FoodID`, `FoodName`) VALUES ('6', 'Steak with boiled potatoes');

INSERT INTO `aircompany`.`foodtoflight` (`FoodID`, `FlightID`) VALUES ('6', '6');

INSERT INTO `aircompany`.`pilot` (`PilotID`, `PilotName`) VALUES ('7', 'Dimitar Iliev');

INSERT INTO `aircompany`.`pilotshift` (`PilotID`, `PilotShiftStartTime`, `PilotShiftEndTime`) VALUES ('7', '2023-03-29 15:15:00', '2023-03-30 04:21:00');

INSERT INTO `aircompany`.`pilottoflight` (`ID`, `PilotID`, `FlightID`) VALUES ('9', '6', '6');

INSERT INTO `aircompany`.`replacepilot` (`Date`, `PilotToReplaceID`, `ReplacePilotID`) VALUES ('2023-03-28', '6', '2');
