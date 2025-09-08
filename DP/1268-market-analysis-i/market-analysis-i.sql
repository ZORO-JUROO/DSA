# Write your MySQL query statement below
with ord as (select count(*) as c,buyer_id as id from Orders where year(order_date)=2019 group by buyer_id)
select user_id as buyer_id, join_date,case when c is null then 0 else c end as orders_in_2019 from users left join ord on users.user_id=ord.id; 