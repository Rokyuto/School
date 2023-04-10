USE aircompany;
select PilotName,COUNT(*) GroupSize
from flights join pilot
on pilot.PilotID = flights.FlightPilot 
GROUP BY PilotName