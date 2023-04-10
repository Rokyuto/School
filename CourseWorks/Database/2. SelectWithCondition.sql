USE aircompany;
select FlightDate,FlightDepartTime,FlightDuration,Airport as FlightAirports,AircraftModel,PilotName,FoodName
from flights 
join airports on (flights.FlightStartAirport = airports.AirportID or flights.FlightEndAirport = airports.AirportID)
join aircraft on flights.FlightAircraft = aircraft.AircraftID
join food on flights.FlightFood = food.FoodID 
join pilot on pilot.PilotID = flights.FlightPilot
where FlightDate < '2018-00-00';