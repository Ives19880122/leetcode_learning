//Table: Employee 
//
// 
//+-------------+------+
//| Column Name | Type |
//+-------------+------+
//| id          | int  |
//| salary      | int  |
//+-------------+------+
//id is the primary key column for this table.
//Each row of this table contains information about the salary of an employee.
// 
//
// 
//
// Write an SQL query to report the second highest salary from the Employee 
//table. If there is no second highest salary, the query should report null. 
//
// The query result format is in the following example. 
//
// 
// Example 1: 
//
// 
//Input: 
//Employee table:
//+----+--------+
//| id | salary |
//+----+--------+
//| 1  | 100    |
//| 2  | 200    |
//| 3  | 300    |
//+----+--------+
//Output: 
//+---------------------+
//| SecondHighestSalary |
//+---------------------+
//| 200                 |
//+---------------------+
// 
//
// Example 2: 
//
// 
//Input: 
//Employee table:
//+----+--------+
//| id | salary |
//+----+--------+
//| 1  | 100    |
//+----+--------+
//Output: 
//+---------------------+
//| SecondHighestSalary |
//+---------------------+
//| null                |
//+---------------------+
// 
// Related Topics Database 👍 1715 👎 693
    
package leetcode.editor.en;
/** 
 * id: 176
 * title: Second Highest Salary
 * author: Ives.He 
 * date: 2022-03-23 21:28:04
 * for TEST copy:
 * import leetcode.editor.en.P176_SecondHighestSalary .Solution;
 * P176_SecondHighestSalary_Test
 */
public class P176_SecondHighestSalary{
    //There is no code of Java type for this problem
    /**
     * SQL解1
     * DECLARE @data int;
     * SELECT @data=SALARY
     * FROM(
     *   SELECT SALARY, rank() over (Order by Salary desc) rank FROM Employee
     * ) d
     * WHERE rank = 2
     * SELECT @data SecondHighestSalary
     *
     * Runtime: 1485 ms, faster than 30.47% of MS SQL Server online submissions for Second Highest Salary.
     * Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Second Highest Salary.
     *
     * SQL解2 加速
     * 排除最大那筆以後,再去選擇最大那筆
     * SELECT max(SALARY) SecondHighestSalary FROM
     * (SELECT SALARY FROM Employee
     * EXCEPT
     * SELECT max(SALARY) FROM Employee) m
     *
     * Runtime: 774 ms, faster than 90.86% of MS SQL Server online submissions for Second Highest Salary.
     * Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Second Highest Salary.
     */
}