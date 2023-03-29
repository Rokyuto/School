SELECT Name, Continent, Population
FROM country 
where population = (select min(Population) from country)

