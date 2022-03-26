-- 1965. Employees With Missing Information
-- Table Schema
Create table #Employees (employee_id int, name varchar(30))
Create table #Salaries (employee_id int, salary int)
insert into #Employees (employee_id, name) values ('2', 'Crew')
insert into #Employees (employee_id, name) values ('4', 'Haven')
insert into #Employees (employee_id, name) values ('5', 'Kristian')
insert into #Salaries (employee_id, salary) values ('5', '76071')
insert into #Salaries (employee_id, salary) values ('1', '22517')
insert into #Salaries (employee_id, salary) values ('4', '63539')
insert into #Salaries (employee_id, salary) values ('3', '32323')


/**
Write an SQL query to report the IDs of all the employees with missing information. 
The information of an employee is missing if:
The employee's name is missing, or
The employee's salary is missing.
Return the result table ordered by employee_id in ascending order.
*/

-- 直覺解Union 

SELECT * FROM(
  SELECT employee_id FROM #Employees
  Union
  SELECT employee_id FROM #Salaries
)m
EXCEPT
SELECT * FROM(
  SELECT employee_id FROM #Employees
  INTERSECT
  SELECT employee_id FROM #Salaries
)i
ORDER BY employee_id asc
/**
Runtime: 928 ms, faster than 61.66% of MS SQL Server online submissions for Employees With Missing Information.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Employees With Missing Information.
*/

-- 參考解 full outer join
SELECT employee_id FROM (
  SELECT 
   -- 這個判斷會讓可以交集的資料回傳null
   CASE WHEN b.salary IS NULL THEN a.employee_id
   WHEN a.name IS NULL THEN b.employee_id
   END AS employee_id
  FROM #Employees a
  FULL OUTER JOIN #Salaries b
  ON a.employee_id = b.employee_id
) m
WHERE employee_id IS NOT NULL
ORDER BY employee_id
/**
Runtime: 964 ms, faster than 56.48% of MS SQL Server online submissions for Employees With Missing Information.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Employees With Missing Information.
*/

-- 參考優化判斷式
SELECT employee_id FROM (
  SELECT 
   isnull(a.employee_id,b.employee_id) employee_id
  FROM #Employees a
  FULL OUTER JOIN #Salaries b
  ON a.employee_id = b.employee_id
  WHERE a.employee_id is null or b.employee_id is null
) m
ORDER BY employee_id
/**
Runtime: 1102 ms, faster than 45.08% of MS SQL Server online submissions for Employees With Missing Information.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Employees With Missing Information.
*/

-- 小結: 數學判斷比較快

-- 移除暫存表
Drop table #Employees
Drop table #Salaries