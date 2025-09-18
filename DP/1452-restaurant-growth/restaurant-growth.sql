# Write your MySQL query statement below
with a as (select distinct visited_on from customer order by visited_on asc LIMIT 18446744073709551615 offset 6) 
select a.visited_on,sum(b.amount) as amount,round(sum(b.amount)/7,2) as average_amount from a inner join customer b on DATEDIFF(a.visited_on,b.visited_on) BETWEEN 0 AND 6
 group by a.visited_on