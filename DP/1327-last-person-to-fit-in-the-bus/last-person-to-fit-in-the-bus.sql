# Write your MySQL query statement below
with a as (select  sum(weight) over (order by turn) as w,person_name,turn from QUEUE)
select person_name from a where w<=1000 order by  turn desc limit 1; 
