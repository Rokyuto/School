USE aircompany;
select *,count(*) FoodGroupCount 
from flights
join food,foodtoflight 
where flights.FlightID = foodtoflight.FlightID and foodtoflight.FoodID = food.FoodID
group by FoodName