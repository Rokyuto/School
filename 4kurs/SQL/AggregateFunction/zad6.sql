select Name,SurfaceArea,Continent
from country
where SurfaceArea = (select max(SurfaceArea) from country where Continent like "South America")
