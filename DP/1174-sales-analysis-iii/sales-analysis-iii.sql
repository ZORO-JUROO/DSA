# Write your MySQL query statement below
with a as (select product_id from sales where sale_date not between '2019-01-01' and '2019-03-31'),
b as (select product_id from sales where product_id not in (select product_id from a))
select product_id,product_name from Product where product_id in (select product_id from b) 