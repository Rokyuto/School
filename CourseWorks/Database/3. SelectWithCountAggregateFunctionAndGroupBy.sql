USE aircompany;
select FlightDate,FlightDepartTime,FlightDuration,FlightStartAirport,FlightEndAirport,
AircraftModel, pilot.PilotName,COUNT(*) GroupSize, food.FoodName as FlightFood
from flights join aircraft,aircrafttoflight,food,foodtoflight,pilot,pilottoflight
where (aircrafttoflight.AircraftID = aircraft.AircraftID and 
aircrafttoflight.FlightID = flights.FlightID and
foodtoflight.FoodID = food.FoodID and foodtoflight.FlightID = flights.FlightID and
pilottoflight.PilotID = pilot.PilotID and  pilottoflight.FlightID = flights.FlightID)
GROUP BY PilotName