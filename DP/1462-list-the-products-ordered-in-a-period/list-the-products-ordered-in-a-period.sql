# Write your MySQL query statement below
WITH A AS (select product_id,sum(unit) as unit from Orders where year(order_date)=2020 and month(order_date)=2 group by product_id having sum(unit)>99)
select d.product_name,a.unit from products d inner join a on d.product_id=a.product_id; 