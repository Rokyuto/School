SELECT Country.Name as Country, countrylanguage.Language
From country join countrylanguage 
on Country.Code = countrylanguage.CountryCode
where Country.Name like "Australia"