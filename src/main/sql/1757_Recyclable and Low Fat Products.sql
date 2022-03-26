-- 1757. Recyclable and Low Fat Products
-- table schema
Create table #Products (product_id int, low_fats nvarchar(2), recyclable nvarchar(2))
insert into #Products (product_id, low_fats, recyclable) values ('0', 'Y', 'N')
insert into #Products (product_id, low_fats, recyclable) values ('1', 'Y', 'Y')
insert into #Products (product_id, low_fats, recyclable) values ('2', 'N', 'Y')
insert into #Products (product_id, low_fats, recyclable) values ('3', 'Y', 'Y')
insert into #Products (product_id, low_fats, recyclable) values ('4', 'N', 'N')
/**
Write an SQL query to find the ids of products that are both low fat and recyclable.
Return the result table in any order.
*/
-- 直覺解
SELECT product_id 
FROM #Products 
WHERE low_fats = 'Y' and recyclable = 'Y'
/**
Runtime: 1527 ms, faster than 37.78% of MS SQL Server online submissions for Recyclable and Low Fat Products.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Recyclable and Low Fat Products.
*/

-- 集合測
SELECT product_id 
FROM #Products 
WHERE low_fats = 'Y'
INTERSECT
SELECT product_id 
FROM #Products 
WHERE recyclable = 'Y'
/**
Runtime: 1491 ms, faster than 38.23% of MS SQL Server online submissions for Recyclable and Low Fat Products.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Recyclable and Low Fat Products.
*/

-- 排除法 (很慢不要用)
SELECT product_id FROM #Products 
EXCEPT
SELECT product_id FROM #Products 
WHERE low_fats = 'N'
EXCEPT
SELECT product_id FROM #Products 
WHERE recyclable = 'N'

Drop table #Products