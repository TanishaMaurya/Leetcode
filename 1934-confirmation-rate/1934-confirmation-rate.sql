# Write your MySQL query statement below

select signups.user_id , ifnull(round(sum(action='confirmed')/count(action),2),0)
as confirmation_rate from  signups left join confirmations on 
signups.user_id = confirmations.user_id group by user_id;


