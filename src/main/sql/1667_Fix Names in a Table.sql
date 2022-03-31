-- 1667. Fix Names in a Table
-- 直覺解,複習SQL SERVER function
SELECT
    user_id,
    concat(LEFT(UPPER(name),1) , STUFF(LOWER(name),1,1,'')) name
FROM Users
ORDER by user_id asc

/**
* Runtime: 1579 ms, faster than 98.96% of MS SQL Server online submissions for Fix Names in a Table.
* Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Fix Names in a Table.
*/