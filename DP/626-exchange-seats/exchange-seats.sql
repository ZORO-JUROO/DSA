# Write your MySQL query statement below
with last as (select id from Seat order by id desc limit 1)
select case
when id%2=0 then id-1
when id%2=1 and id not in(select id from last) then id+1
else id
end
as id,student
from Seat order by id ;