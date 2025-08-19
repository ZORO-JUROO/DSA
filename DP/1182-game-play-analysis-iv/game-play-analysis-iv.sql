# Write your MySQL query statement below
with tot as (select count( distinct player_id) as total from Activity ),
frac as(select player_id from(select player_id,row_number() over(partition by player_id order by event_date asc)as rr,lag(event_date,1) over (partition by player_id order by event_date asc) as prev,event_date from Activity)temp where rr=2 and datediff(event_date,prev)=1),
fracc as (select count(*)as ff from frac)
select round(ff/total,2) as fraction from tot join fracc;