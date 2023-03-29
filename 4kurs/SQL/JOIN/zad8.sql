SELECT country.Name, countrylanguage.Language, countrylanguage.Percentage, FORMAT(((countrylanguage.Percentage / 100) * country.Population), 0) as SpeekingPopulation, FORMAT(country.Population, 0) as CountryPopulation
From country join countrylanguage
on Country.Continent = "Europe"
where countrylanguage.Language = "Arabic"
and Country.Code = countrylanguage.CountryCode
order by country.SurfaceArea desc
limit 1;