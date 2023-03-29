SELECT Country.Name as Country, City.name as Capital, Country.Population as CountryPopulation, City.Population as CityPopulation
From country join City 
on Country.Capital = City.ID
where Country.Name like "Malta";