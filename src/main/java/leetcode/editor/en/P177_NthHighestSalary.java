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
// Write an SQL query to report the nᵗʰ highest salary from the Employee table. 
//If there is no nᵗʰ highest salary, the query should report null. 
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
//n = 2
//Output: 
//+------------------------+
//| getNthHighestSalary(2) |
//+------------------------+
//| 200                    |
//+------------------------+
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
//n = 2
//Output: 
//+------------------------+
//| getNthHighestSalary(2) |
//+------------------------+
//| null                   |
//+------------------------+
// 
// Related Topics Database 👍 998 👎 636
    
package leetcode.editor.en;
/** 
 * id: 177
 * title: Nth Highest Salary
 * author: Ives.He 
 * date: 2022-03-23 22:03:28
 * for TEST copy:
 * import leetcode.editor.en.P177_NthHighestSalary .Solution;
 * P177_NthHighestSalary_Test
 */
public class P177_NthHighestSalary{
    public void info(){
        System.out.println("this is a sql problem");
    }
    //There is no code of Java type for this problem
    /**
     * CREATE FUNCTION getNthHighestSalary(@N INT) RETURNS INT AS
     * BEGIN
     *     RETURN (
     *
     * SELECT SALARY 'getNthHighestSalary(@N)'
     * FROM(
     *  SELECT SALARY, rank() over (Order by Salary desc)rank
     *  FROM Employee
     *  --要記得用Group by洗資料,避免重複數據
     *  GROUP BY SALARY
     * )d
     * WHERE rank = @N
     *);
     *END
     *
     * Runtime: 951 ms, faster than 71.27% of MS SQL Server online submissions for Nth Highest Salary.
     * Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Nth Highest Salary.
     */
}