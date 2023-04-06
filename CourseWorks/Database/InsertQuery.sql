use aircompany;
INSERT INTO `aircompany`.`airports` (`Airport`) VALUES ('New York');

INSERT INTO `aircompany`.`aircraft` (`AircraftModel`) VALUES ('Airbus A331');

INSERT INTO `aircompany`.`food` (`FoodName`) VALUES ('Steak with boiled potatoes');

INSERT INTO `aircompany`.`pilot` (`PilotName`) VALUES ('Dimitar Iliev');

INSERT INTO `aircompany`.`flights` (`FlightDate`, `FlightDepartTime`, `FlightDuration`, `FlightStartAirport`, `FlightEndAirport`,`FlightAircraft`,`FlightFood`) 
VALUES ('2023-03-30', '21:45:00', '01:30:00', '5', '7','2','1');

INSERT INTO `aircompany`.`pilotshift` (`PilotID`, `PilotShiftStartTime`, `PilotShiftEndTime`) VALUES ('7', '2023-03-29 15:15:00', '2023-03-30 04:21:00');

INSERT INTO `aircompany`.`pilottoflight` (`ID`, `PilotID`, `FlightID`) VALUES ('9', '6', '6');

INSERT INTO `aircompany`.`replacepilot` (`ReplaceDate`, `PilotToReplaceID`, `ReplacePilotID`) VALUES ('2023-03-28', '6', '2');
