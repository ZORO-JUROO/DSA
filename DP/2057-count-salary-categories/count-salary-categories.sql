# Write your MySQL query statement below
select "High Salary" as category,count(*) as accounts_count from accounts where income>50000
union
select "Low Salary" , count(*) from accounts where income<20000
union
select "Average Salary",count(*) from accounts where income>=20000 and income<=50000;