use aircompany;
SELECT *
from flights
left outer join pilottoflight 
	inner join pilot on pilot.PilotID = pilottoflight.PilotID 
on flights.FlightID = pilottoflight.FlightID
where flights.FlightID < 4;