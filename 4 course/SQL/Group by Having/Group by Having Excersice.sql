# zad 1
SELECT Continent,SUM(SurfaceArea) as Area
FROM country 
group by SurfaceArea;

# zad 2
Select Continent,country.name, max(population) as Poppulation 
from country
group by Population;
				
# zad 3
Select Continent,country.name, avg(lifeexpectancy) as "Average Life expectancy" 
from country  
where Continent="Europe" 
group by lifeexpectancy ;

# zad 4
Select Continent,country.name,count(name)
from country 
group by name  ;

# zad 7
 Select Continent,SUM(SurfaceArea) as SurfaceArea
 from country 
 group by Continent
 Having Sum(SurfaceArea) >700000;

# zad 8
 Select Continent,AVG(LifeExpectancy) as LifeExpectancy
 from country 
 group by Continent 
 Having AVG(LifeExpectancy) >75;

# zad 9
 Select Language,COUNT(CountryCode) as CountryCode
 from countrylanguage 
 group by language 
 Having Count(CountryCode) >20;
 
# zad 10
Select GovernmentForm as GovernmentForm,SUM(population) as Population
from country 
group by GovernmentForm 
Having SUM(population) >1000000000;