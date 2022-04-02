-- 1393. Capital Gain/Loss
-- table schema
Create Table #Stocks (stock_name varchar(15), operation nvarchar(10), operation_day int, price int)
insert into #Stocks (stock_name, operation, operation_day, price) values ('Leetcode', 'Buy', '1', '1000')
insert into #Stocks (stock_name, operation, operation_day, price) values ('Corona Masks', 'Buy', '2', '10')
insert into #Stocks (stock_name, operation, operation_day, price) values ('Leetcode', 'Sell', '5', '9000')
insert into #Stocks (stock_name, operation, operation_day, price) values ('Handbags', 'Buy', '17', '30000')
insert into #Stocks (stock_name, operation, operation_day, price) values ('Corona Masks', 'Sell', '3', '1010')
insert into #Stocks (stock_name, operation, operation_day, price) values ('Corona Masks', 'Buy', '4', '1000')
insert into #Stocks (stock_name, operation, operation_day, price) values ('Corona Masks', 'Sell', '5', '500')
insert into #Stocks (stock_name, operation, operation_day, price) values ('Corona Masks', 'Buy', '6', '1000')
insert into #Stocks (stock_name, operation, operation_day, price) values ('Handbags', 'Sell', '29', '7000')
insert into #Stocks (stock_name, operation, operation_day, price) values ('Corona Masks', 'Sell', '10', '10000')

/**
*Write an SQL query to report the Capital gain/loss for each stock.
* The Capital gain/loss of a stock is the total gain or loss after buying and selling 
* the stock one or many times.
* Return the result table in any order.
*/

-- 直覺解
SELECT stock_name, 
 sum(price * case operation when 'Buy' then -1 when 'Sell' then 1 end) capital_gain_loss
FROM #Stocks
GROUP BY stock_name

/**
* Runtime: 1307 ms, faster than 99.52% of MS SQL Server online submissions for Capital Gain/Loss.
* Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Capital Gain/Loss.
*/


drop table #Stocks
