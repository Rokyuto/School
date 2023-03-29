SELECT Country.Name as Country, City.name as Capital
From country join City 
on Country.Capital = City.ID
order by Country.Name asc;