# Write your MySQL query statement below
with user as(select users_id from Users where banned not like 'Yes'),

trip as (select * from trips where request_at BETWEEN '2013-10-01' AND '2013-10-03' and client_id in (select users_id from user) and driver_id in (select users_id from user)),

t as(select count(*) as c,request_at from trip group by request_at having count(*)>0),
cancel as (select count(*)as c2,request_at from trip where status not like'completed' group by request_at)
select t.request_at as Day, 
case 
when c2 is null then 0.00
else round(c2/c,2)
end as 'Cancellation Rate' from t left join cancel on t.request_at=cancel.request_At  

