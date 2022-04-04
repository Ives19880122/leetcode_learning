-- 1527. Patients With a Condition
-- 使用STRING_SPLIT切割字串後,找到DIAB1開頭的關鍵字
SELECT * 
FROM Patients
WHERE EXISTS(
    SELECT TOP 1 1 
    FROM STRING_SPLIT(conditions,' ') 
    WHERE value like 'DIAB1%'
)
/**
* Runtime: 417 ms, faster than 100.00% of MS SQL Server online submissions for Patients With a Condition.
* Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Patients With a Condition.
*/