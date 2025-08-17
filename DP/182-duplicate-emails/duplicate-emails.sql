# Write your MySQL query statement below
select distinct email as Email from (select count(*) over (partition by email) as c,email from Person) p where c>1;