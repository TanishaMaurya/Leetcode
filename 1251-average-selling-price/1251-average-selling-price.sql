# Write your MySQL query statement below

select p1.product_id, ifnull(round(sum(price*units)/sum(units),2),0) as average_price from Prices p1
left join UnitsSold u on p1.product_id=u.product_id and u.purchase_date between start_date and end_date
group by product_id