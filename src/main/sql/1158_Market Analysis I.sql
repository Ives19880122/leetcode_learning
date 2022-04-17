-- 1158. Market Analysis I

-- 直覺解
SELECT 
  user_id buyer_id, 
  join_date,
  ISNULL((
    SELECT count(1) 
    FROM Orders 
    WHERE YEAR(order_date)='2019' and buyer_id = user_id)
  ,0) orders_in_2019
FROM Users

/**
 * Runtime: 3953 ms, faster than 14.38% of MS SQL Server online submissions for Market Analysis I.
 * Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Market Analysis I.
 */

 