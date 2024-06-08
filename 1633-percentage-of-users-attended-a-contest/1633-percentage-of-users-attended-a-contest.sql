
# Write your MySQL query statement below


select Register.contest_id, round(count(contest_id)*100/(select count(*) from users),2) 
as percentage from Register group by contest_id
Order By percentage DESC,contest_id;

