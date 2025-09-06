# Write your MySQL query statement below
with a as (select count(*) as c from Product)
select customer_id from Customer group by customer_id having count( distinct product_key) = (select c from a);