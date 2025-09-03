# Write your MySQL query statement below
with parent as (select distinct p_id from Tree WHERE P_ID IS NOT NULL)
select id,"Root" as type from Tree where p_id is null union select id,"Inner" from Tree where id in (select p_id from parent) and p_id is not null union select id,"Leaf" from Tree where id not in (select p_id from parent) And p_id is not null;
