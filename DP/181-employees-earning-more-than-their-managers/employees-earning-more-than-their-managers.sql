# Write your MySQL query statement below
select name as Employee from (select e.name,e.salary,m.salary as msal from Employee e inner join Employee m on m.id=e.managerId)temp where salary>msal;