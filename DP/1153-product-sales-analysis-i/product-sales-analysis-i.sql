# Write your MySQL query statement below
select product_name,year,price from sales inner join Product on sales.product_id=Product.product_id;