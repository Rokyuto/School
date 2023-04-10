use aircompany;
SELECT *
from pilot
left outer join pilotshift
on pilot.PilotID = pilotshift.PilotID;