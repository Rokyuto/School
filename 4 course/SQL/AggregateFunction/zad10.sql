select Name,SurfaceArea,IndepYear
from country
where SurfaceArea = (select max(SurfaceArea) from country where IndepYear > 1950)
