select Name,GovernmentForm,Population
from country
where Population = (select max(Population) from country where GovernmentForm like "Monarchy")
