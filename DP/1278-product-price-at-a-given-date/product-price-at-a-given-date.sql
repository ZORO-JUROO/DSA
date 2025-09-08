# Write your MySQL query statement below
with a as (select product_id,max(change_date) as max from Products where change_date<='2019-08-16' group by  product_id),
b as
(select product_id,new_price as price from Products where (product_id,change_date) in (select product_id,max from a)),
c as 
(select distinct product_id from Products)
select c.product_id,case when price is null then 10 else price end as price from c left join b on c.product_id=b.product_id; 