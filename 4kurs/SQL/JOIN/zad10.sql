select country.Name, countrylanguage.Language
from country
left join countrylanguage on countrylanguage.CountryCode = country.Code
where country.Capital is null;