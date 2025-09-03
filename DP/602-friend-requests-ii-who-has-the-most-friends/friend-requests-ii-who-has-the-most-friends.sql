# Write your MySQL query statement below
with r as (select requester_id as id from RequestAccepted union all select accepter_id from RequestAccepted)
select id,c as num from (select id,count(*) over ( partition by id) as c from r)temp order by c desc limit 1;