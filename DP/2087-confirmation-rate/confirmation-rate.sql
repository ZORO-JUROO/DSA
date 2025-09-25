# Write your MySQL query statement below
with a as (select user_id,round(count(case when action like 'timeout' then null else action end)/count(*),2) as confirmation_rate from confirmations group by user_id)
select signups.user_id, case when confirmation_rate is null then 0 else confirmation_rate end as confirmation_rate from signups left join a on a.user_id=signups.user_id