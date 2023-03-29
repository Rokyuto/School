select Name,SurfaceArea,Continent
from country
where SurfaceArea = (select min(SurfaceArea) from country)
and
Continent = 'Europe'