select GovernmentForm,sum(Population)
from country
where
GovernmentForm like 'Monarchy'