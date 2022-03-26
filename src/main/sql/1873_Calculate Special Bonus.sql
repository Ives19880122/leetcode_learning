-- 1873. Calculate Special Bonus
Create table #Employees (employee_id int, name varchar(30), salary int)
insert into #Employees (employee_id, name, salary) values ('2', 'Meir', '3000')
insert into #Employees (employee_id, name, salary) values ('3', 'Michael', '3800')
insert into #Employees (employee_id, name, salary) values ('7', 'Addilyn', '7400')
insert into #Employees (employee_id, name, salary) values ('8', 'Juan', '6100')
insert into #Employees (employee_id, name, salary) values ('9', 'Kannon', '7700')

/**
* Write an SQL query to calculate the bonus of each employee. 
* The bonus of an employee is 100% of their salary 
* if the ID of the employee is an odd number and 
* the employee name does not start with the character 'M'. 
* The bonus of an employee is 0 otherwise.
* Return the result table ordered by employee_id.
*/

-- 直覺解1
SELECT employee_id , 
    case when employee_id % 2 = 1 and LEFT([name],1) !='M' THEN salary ELSE 0 END bonus
FROM #Employees
/**
Runtime: 1311 ms, faster than 78.15% of MS SQL Server online submissions for Calculate Special Bonus.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Calculate Special Bonus.
*/

-- join解   變慢
;WITH cte as(
SELECT employee_id , salary bonus FROM #Employees
WHERE employee_id % 2 = 1 and LEFT([name],1) !='M'
)
SELECT e.employee_id, isNUll(bonus,0) bonus
FROM #Employees e
LEFT JOIN cte ON cte.employee_id = e.employee_id
/**
Runtime: 1563 ms, faster than 52.94% of MS SQL Server online submissions for Calculate Special Bonus.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Calculate Special Bonus.
*/

-- 解3 參考使用not like
SELECT employee_id , 
    case when employee_id % 2 = 1 and [name] not like 'M%' THEN salary ELSE 0 END bonus
FROM #Employees
/**
Runtime: 1226 ms, faster than 85.71% of MS SQL Server online submissions for Calculate Special Bonus.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Calculate Special Bonus.
*/


Drop table #Employees