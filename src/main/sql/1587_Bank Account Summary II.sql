--1587. Bank Account Summary II
/**
* Write an SQL query to report the name and balance of users
* with a balance higher than 10000.
* The balance of an account is equal to the sum of the amounts of
* all transactions involving that account.
* Return the result table in any order.
*/

-- 直覺解(group by having, 子查詢)
SELECT
  (SELECT name FROM Users u WHERE u.account = t.account) name,
  sum(amount) balance
FROM Transactions t
GROUP BY account
Having sum(amount) > 10000

/**
* Runtime: 702 ms, faster than 99.21% of MS SQL Server online submissions for Bank Account Summary II.
* Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Bank Account Summary II.
*/