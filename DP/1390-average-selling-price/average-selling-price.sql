# Write your MySQL query statement below
with a as (select u.product_id,units,price from prices u left join unitssold p on u.product_id=p.product_id and purchase_date<=end_date and purchase_date>=start_date),
b as (select product_id, round(sum(case when units is null then 0 else units*price end)/sum(units),2)  as average_price from a group by product_id)
select product_id,case when average_price is null then 0 else average_price end as average_price from b;