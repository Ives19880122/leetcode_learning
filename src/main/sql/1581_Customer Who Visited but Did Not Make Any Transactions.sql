-- 1581. Customer Who Visited but Did Not Make Any Transactions
-- Table Schema
Create table #Visits(visit_id int, customer_id int)
Create table #Transactions(transaction_id int, visit_id int, amount int)
insert into #Visits (visit_id, customer_id) values ('1', '23')
insert into #Visits (visit_id, customer_id) values ('2', '9')
insert into #Visits (visit_id, customer_id) values ('4', '30')
insert into #Visits (visit_id, customer_id) values ('5', '54')
insert into #Visits (visit_id, customer_id) values ('6', '96')
insert into #Visits (visit_id, customer_id) values ('7', '54')
insert into #Visits (visit_id, customer_id) values ('8', '54')
insert into #Transactions (transaction_id, visit_id, amount) values ('2', '5', '310')
insert into #Transactions (transaction_id, visit_id, amount) values ('3', '5', '300')
insert into #Transactions (transaction_id, visit_id, amount) values ('9', '5', '200')
insert into #Transactions (transaction_id, visit_id, amount) values ('12', '1', '910')
insert into #Transactions (transaction_id, visit_id, amount) values ('13', '2', '970')

/**
Write an SQL query to find the IDs of the users who visited without making 
any transactions and the number of times they made these types of visits.
Return the result table sorted in any order.
*/
-- 直覺解(561ms)
SELECT customer_id, count(visit_id) count_no_trans
FROM #Visits
WHERE visit_id not in (
    SELECT visit_id FROM #Transactions
)
GROUP BY customer_id
/**
Runtime: 2835 ms, faster than 55.12% of MS SQL Server online submissions for Customer Who Visited but Did Not Make Any Transactions.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Customer Who Visited but Did Not Make Any Transactions.
*/

-- cte(577ms)
;with cte as(
    SELECT visit_id FROM #Visits
    EXCEPT
    SELECT visit_id FROM #Transactions
)
SELECT customer_id, count(visit_id) count_no_trans
FROM #Visits
WHERE visit_id in (
    SELECT visit_id FROM cte
)
GROUP BY customer_id
/**
Runtime: 2373 ms, faster than 73.23% of MS SQL Server online submissions for Customer Who Visited but Did Not Make Any Transactions.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Customer Who Visited but Did Not Make Any Transactions.
*/

-- exists
;with cte as(
    SELECT visit_id FROM #Visits
    EXCEPT
    SELECT visit_id FROM #Transactions
)
SELECT customer_id, count(visit_id) count_no_trans
FROM #Visits v
WHERE EXISTS(
    SELECT TOP 1 1 
    FROM cte c
    WHERE c.visit_id = v.visit_id
)
GROUP BY customer_id
/**
Runtime: 2512 ms, faster than 63.78% of MS SQL Server online submissions for Customer Who Visited but Did Not Make Any Transactions.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Customer Who Visited but Did Not Make Any Transactions.
*/

Drop table #Visits
Drop table #Transactions