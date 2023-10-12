use world;
/* zad1 */
SELECT country.Name, city.Name, city.Population
from country join city
on country.Code = city.CountryCode AND country.Code = "BGR";

/* zad2 */
SELECT country.Name, city.Name
from country join city
on country.Capital = city.ID
ORDER BY country.Name;


/* zad3 */
SELECT country.Name as Country, city.Name as Capital
from country join city
on country.Capital = city.ID
ORDER BY Country;

/* zad4 */
SELECT country.Name as Country, city.Name as Capital
from country join city
on country.Capital = city.ID 
AND country.Continent like 'Europe'
ORDER BY Country;

/* zad 5 */
SELECT country.Name as Country, city.Name as Capital, country.Population as CountryPopulation, city.Population as CityPopulation
from country join city
on country.Capital = city.ID 
AND country.Name like "Malta"
ORDER BY Country;

/* zad 6 */
SELECT country.Name, countrylanguage.Language
from country join countrylanguage
on country.Code = countrylanguage.CountryCode
AND country.Name like "Australia"
Order by countrylanguage.Language;


/* zad 7 */ 
SELECT distinct countrylanguage.Language, country.Region
from country join countrylanguage
on country.Region like "Caribbean"
AND country.Code = countrylanguage.CountryCode;

SELECT distinct countrylanguage.Language, country.Region
from country join countrylanguage
on country.Code = countrylanguage.CountryCode
where country.Region like "Caribbean"
