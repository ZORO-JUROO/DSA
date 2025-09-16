# Write your MySQL query statement below
with a as (select query_name,round(avg(rating/position),2) as quality from Queries group by query_name)
, b as (select query_name,count(*) as total from queries group by query_name)
,c as (select query_name, count(*) as cc from queries where rating<3 group by query_name)
,d as (select b.query_name,case when cc is null then 0 else round((cc*100.0/total),2) end as poor_query_percentage from b 
left join c on b.query_name=c.query_name)
select a.query_name, quality, poor_query_percentage from a inner join d on a.query_name=d.query_name;