-- 627. Swap Salary
-- 題目測試異常,但是可以提交

-- 簡單直覺解
Update Salary SET sex= case sex when 'm' then 'f' when 'f' then 'm' end

/**
* Runtime: 418 ms, faster than 98.35% of MS SQL Server online submissions for Swap Salary.
* Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Swap Salary.
*/