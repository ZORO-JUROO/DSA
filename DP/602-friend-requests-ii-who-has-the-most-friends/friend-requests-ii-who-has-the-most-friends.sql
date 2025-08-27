# Write your MySQL query statement below
with a as (select count(*) as acc,accepter_id as id from RequestAccepted group by accepter_id),
b as (select count(*) as re, requester_id as id from RequestAccepted group by requester_id),
c as (select (a.acc+b.re) as su,a.id as id from a  inner join b on a.id=b.id union select acc as su,id from a where id not in (select id from b) union select re as su,id from b where id not in (select id from a))
select id,su as num from c order by su desc limit 1;