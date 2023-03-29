select Name,SurfaceArea,Population
from country
where SurfaceArea = (select min(SurfaceArea) from country where Population > 5000000 and Population <10000000)
