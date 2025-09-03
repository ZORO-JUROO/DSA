# Write your MySQL query statement below
WITH I AS (select com_id from Company where NAME='RED'),
b as
(SELECT distinct sales_id from orders where com_id in (select com_id from i))
select name from SalesPerson where sales_id not in (select sales_id from b)
;
