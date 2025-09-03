# Write your MySQL query statement below
with r as (select requester_id as id from RequestAccepted union all select accepter_id from RequestAccepted)
select id,count(*) as num from r group by id order by num desc limit 1;