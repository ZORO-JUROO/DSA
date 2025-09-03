# Write your MySQL query statement below
with t as (select id,id2,id3 from (select id,people, lead(people,1) over(order by id) as l,lead(people,2) over(order by id) as l2,lead(id,1) over(order by id) as id2,lead(id,2) over(order by id) as id3 from Stadium)temp where people>=100 and l>=100 and l2>=100),
t2 as (select id from t union select id2 from t union select id3 from t)
select id,visit_date,people from Stadium where id in (select id from t2);