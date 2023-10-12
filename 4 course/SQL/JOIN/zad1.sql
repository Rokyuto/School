use world;
SELECT country.name, city.name, city.population 
FROM city 
JOIN country ON city.CountryCode = country.Code 
WHERE country.name = 'Bulgaria';
