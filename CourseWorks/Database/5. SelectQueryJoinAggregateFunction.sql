USE aircompany;
select FoodName,count(*) FoodGroupSize 
from flights
join food on flights.FlightFood = food.FoodID
group by FoodName