select Name,GNP,Region,Continent
from country
where GNP = (select max(GNP) from country where Continent like "Europe" and Region not like "Eastern Europe")
