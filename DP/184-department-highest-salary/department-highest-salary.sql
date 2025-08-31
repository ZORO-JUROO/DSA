# Write your MySQL query statement below
with r as (select MAX(SALARY) as msal,departmentId from Employee group by departmentId)
select d.name as Department, e.name as Employee,e.salary from Employee e inner join department d on 
e.departmentId=d.id where (e.salary,e.departmentId) in (select msal,departmentId from r);