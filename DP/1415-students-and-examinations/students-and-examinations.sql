# Write your MySQL query statement below
with a as (select student_id,subject_name,count(*)as c from Examinations group by student_id,subject_name),
b as (select * from students cross join subjects) 

select b.student_id,student_name,b.subject_name,case when c is null then 0 else c end as attended_exams from b left join a on b.student_id=a.student_id and b.subject_name=a.subject_name order by student_id,subject_name;