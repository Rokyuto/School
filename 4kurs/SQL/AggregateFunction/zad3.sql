select Name,GNP,Continent
from country
where GNP = (select min(GNP) from country)
and
Continent = 'Asia'