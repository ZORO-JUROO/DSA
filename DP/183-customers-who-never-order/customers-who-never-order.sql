# Write your MySQL query statement below
select name as Customers from Customers where id not in (Select a.id from Customers a inner join orders b on a.id=b.customerId) ;