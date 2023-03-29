select Name,SurfaceArea,Continent
from country
where SurfaceArea = (select min(SurfaceArea) from country where Name like "A%")
