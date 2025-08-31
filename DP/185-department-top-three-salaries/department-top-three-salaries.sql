# Write your MySQL query statement below
with a as
(select dense_rank() over (partition by departmentId order by salary desc) as r, departmentId,salary from Employee),
b as (select departmentId,salary from a where r=1 or r=2 or r=3)
select d.name as Department, e.name as Employee,e.salary from Employee e inner join department d on 
e.departmentId=d.id where (e.salary,e.departmentId) in (select salary,departmentId from b);