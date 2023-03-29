/* zad1 */
SELECT *
FROM country
where GovernmentForm LIKE 'M%';

/* zad2 */
SELECT *
FROM country
where Region LIKE '%nesia';

/* zad3 */
SELECT *
FROM country
where Name LIKE '____';

/* zad4 */
SELECT *
FROM country
where Name LIKE 'A%' AND Continent LIKE 'A%'
and Population >= 10000000;

/* zad5 */
SELECT *
FROM country
where Name LIKE 'B%A';

/* zad6 */
SELECT *
FROM country
where Continent LIKE 'Europe' or 'Asia'
or Name like 'A%'
order by Name;

/* zad7 */
SELECT *
FROM country
where Continent IN ('Europe' , 'Asia');

/* zad8 */
SELECT *
FROM country
where Continent IN ('Asia' , 'Europe')
order by Continent,Name;

/* zad9 */
SELECT *
FROM country join countrylanguage
where countrylanguage.Language IN ('Spanish' , 'French')
and country.Code = countrylanguage.CountryCode;

/* zad10 */
SELECT *
FROM country
where IndepYear IN (1950,1960,1970);

/* zad11 */
SELECT *
FROM country
where Continent LIKE 'Europe'
and Region NOT IN ('Southern Europe' , 'Eastern Europe')
order by Region;



