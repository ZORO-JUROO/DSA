# Write your MySQL query statement below
with a as (select name,m.user_id,count(*) as c from movierating m inner join users on m.user_id=users.user_id group by user_id order by c desc,name asc limit 1),
     b as (select title,m.movie_id,avg(rating) as c from movierating m inner join movies on movies.movie_id=m.movie_id where year(created_at)=2020 and month(created_at)=2 group by movie_id order by c desc,title asc limit 1)

select results from ( select name as results from a union all select title from b) t;
