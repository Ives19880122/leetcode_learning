-- 586. Customer Placing the Largest Number of Orders
Create table #orders (order_number int, customer_number int)
insert into #orders (order_number, customer_number) values ('1', '1')
insert into #orders (order_number, customer_number) values ('2', '2')
insert into #orders (order_number, customer_number) values ('3', '3')
insert into #orders (order_number, customer_number) values ('4', '3')
-- # 解1
SELECT customer_number FROM(
SELECT customer_number, dense_rank() over (order by nums desc) rank
FROM (
    SELECT distinct customer_number , count(*) over(partition by customer_number) nums
    FROM #orders
) m
)c 
where rank = 1

/**
 Runtime: 3548 ms, faster than 6.67% of MS SQL Server online submissions for Customer Placing the Largest Number of Orders.
 Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Customer Placing the Largest Number of Orders.
*/

-- 改用cte先整理資料 避免過多group by
;with cte as( 
	SELECT customer_number , count(*)  nums
	FROM #orders
	GROUP BY customer_number
) 
SELECT customer_number 
FROM cte 
WHERE nums in (SELECT max(nums) FROM cte)

/**
Runtime: 962 ms, faster than 93.95% of MS SQL Server online submissions for Customer Placing the Largest Number of Orders.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Customer Placing the Largest Number of Orders.
*/

drop table #orders