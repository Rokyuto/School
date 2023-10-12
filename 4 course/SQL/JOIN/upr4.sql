use sakila;
SELECT distinct actor.first_name, actor.last_name, actor.actor_id, film.title
from actor join film_actor
on actor.actor_id = film_actor.actor_id
join film 
on film.film_id = film_actor.film_id
AND film_actor.actor_id = 1