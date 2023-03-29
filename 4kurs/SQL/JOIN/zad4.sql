SELECT Country.Name, City.name
From country join City 
on Country.Capital = City.ID
where Country.Continent like "Europe"
order by Country.Name asc;