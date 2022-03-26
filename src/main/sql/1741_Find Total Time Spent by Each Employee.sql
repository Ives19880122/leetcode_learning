-- 1741. Find Total Time Spent by Each Employee
-- table schema
Create table #Employees(emp_id int, event_day date, in_time int, out_time int)
insert into #Employees (emp_id, event_day, in_time, out_time) values ('1', '2020-11-28', '4', '32')
insert into #Employees (emp_id, event_day, in_time, out_time) values ('1', '2020-11-28', '55', '200')
insert into #Employees (emp_id, event_day, in_time, out_time) values ('1', '2020-12-3', '1', '42')
insert into #Employees (emp_id, event_day, in_time, out_time) values ('2', '2020-11-28', '3', '33')
insert into #Employees (emp_id, event_day, in_time, out_time) values ('2', '2020-12-9', '47', '74')

/**
Write an SQL query to calculate the total time in minutes spent 
by each employee on each day at the office. 
Note that within one day, an employee can enter and leave more than once. 
The time spent in the office for a single entry is out_time - in_time.
Return the result table in any order.
*/

-- 直覺解
SELECT event_day [day], emp_id, sum(out_time-in_time) total_time
FROM #Employees
GROUP BY event_day, emp_id

/**
Runtime: 777 ms, faster than 89.73% of MS SQL Server online submissions for Find Total Time Spent by Each Employee.
Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Find Total Time Spent by Each Employee.
*/

Drop table #Employees