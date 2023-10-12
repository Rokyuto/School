SELECT countrylanguage.Language, country.Region 
From countrylanguage join country
on countrylanguage.CountryCode = Country.Code
and Country.Region = "Caribbean"
group by countrylanguage.Language;