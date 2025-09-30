# Write your MySQL query statement below
with a as (select reports_to, count(*) as reports_count,avg(age) as av from employees group by reports_to)
select employee_id,name,reports_count,round(av) as average_age from employees inner join a on employees.employee_id=a.reports_to order by employee_id;