-- Define Database which will be used
USE world;
-- Data which will be diplayed
SELECT countryTable.Name AS countryName, countryTable.Population AS countryPopulation, countryTable.Continent AS countryContinent,
	cityTable.Name AS countryCapital, cityTable.Population as capitalPopulation,
	countrylanguage.Language, countrylanguage.Percentage as countryLanguagePercentage,
    -- Homework: Calculate what part of the country's population speak the relevant language by the percentage
    (countryTable.Population * (countrylanguage.Percentage / 100 ) ) as CountryPopulationSpeakingTheRelevantLanguage
    --
-- Source Tables
FROM world.country AS countryTable, 
	world.city AS cityTable, 
    countrylanguage
-- Conditions   
WHERE countryTable.Capital = cityTable.ID AND
	Continent like 'Europe' AND
    countrylanguage.CountryCode = countryTable.Code
-- Print in country' capital' Population Decrease 
ORDER BY capitalPopulation DESC -- Debug with languagePopulationSpeakPercentage