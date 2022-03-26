-- 1795_Rearrange Products Table
-- Table Schema
Create table #Products (product_id int, store1 int, store2 int, store3 int)
insert into #Products (product_id, store1, store2, store3) values ('0', '95', '100', '105')
insert into #Products (product_id, store1, store2, store3) values ('1', '70', null, '80')

/**
Write an SQL query to rearrange the Products table so that each row has (product_id, store, price). 
If a product is not available in a store, 
do not include a row with that product_id and store combination in the result table.
Return the result table in any order.
*/

-- 學習使用 unpivot
SELECT product_id, store, price
FROM #Products
UNPIVOT(
    price for store in (store1,store2,store3)
) up

/**
Runtime: 1094 ms, faster than 51.93% of MS SQL Server online submissions for Rearrange Products Table.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Rearrange Products Table.
*/

-- 清除暫存表
Drop table #Products