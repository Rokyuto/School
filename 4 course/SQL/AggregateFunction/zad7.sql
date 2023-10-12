select Name,LifeExpectancy
from country
where LifeExpectancy = (select max(LifeExpectancy) from country)
