# Write your MySQL query statement below
with a as (select min(order_date) as o,customer_id from Delivery group by customer_id order by order_date),
b as (select order_date,customer_pref_delivery_date from Delivery inner join  a on Delivery.customer_id=a.customer_id and Delivery.order_date=a.o),
total as(select count(*) as c from b)
select round(count(*)*100.0/(select c from total),2) as immediate_percentage from b where order_date=customer_pref_delivery_date ;