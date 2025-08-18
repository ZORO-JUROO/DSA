# Write your MySQL query statement below
WITH TEMP AS (SELECT MIN(id) as id from Person group by email)
DELETE FROM Person p where p.id not IN (select id from TEMP);