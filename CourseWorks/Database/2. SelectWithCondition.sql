USE aircompany;
select *
from flights 
join aircraft on flights.FlightAircraft = aircraft.AircraftID
join food on flights.FlightFood = food.FoodID 
join pilot on pilot.PilotID = flights.PilotID
where FlightDate > '2016-00-00';