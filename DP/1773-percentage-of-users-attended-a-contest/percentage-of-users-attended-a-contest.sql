# Write your MySQL query statement below
with a as (select count(*) as c from users)
select contest_id, round(count(*)*100/(select c from a),2) as percentage from register group by contest_id order by percentage desc,contest_id