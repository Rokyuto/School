SELECT Country.Name, City.name
From country join City 
on Country.Capital = City.ID
order by Country.Name asc;