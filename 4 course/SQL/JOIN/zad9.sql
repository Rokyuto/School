SELECT country.Name,FORMAT(country.Population, 0) as CountryPopulation, countrylanguage.Language, countrylanguage.Percentage, FORMAT(((countrylanguage.Percentage / 100) * country.Population), 0) as SpeekingPopulation
From country join countrylanguage
on countrylanguage.Language = "Bulgariana"
and Country.Code = countrylanguage.CountryCode;