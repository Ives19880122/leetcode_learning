//Table: Employee 
//
// 
//+-------------+---------+
//| Column Name | Type    |
//+-------------+---------+
//| id          | int     |
//| name        | varchar |
//| salary      | int     |
//| managerId   | int     |
//+-------------+---------+
//id is the primary key column for this table.
//Each row of this table indicates the ID of an employee, their name, salary, 
//and the ID of their manager.
// 
//
// 
//
// Write an SQL query to find the employees who earn more than their managers. 
//
// Return the result table in any order. 
//
// The query result format is in the following example. 
//
// 
// Example 1: 
//
// 
//Input: 
//Employee table:
//+----+-------+--------+-----------+
//| id | name  | salary | managerId |
//+----+-------+--------+-----------+
//| 1  | Joe   | 70000  | 3         |
//| 2  | Henry | 80000  | 4         |
//| 3  | Sam   | 60000  | Null      |
//| 4  | Max   | 90000  | Null      |
//+----+-------+--------+-----------+
//Output: 
//+----------+
//| Employee |
//+----------+
//| Joe      |
//+----------+
//Explanation: Joe is the only employee who earns more than his manager.
// 
// Related Topics Database 👍 1305 👎 151
    
package leetcode.editor.en;
/** 
 * id: 181
 * title: Employees Earning More Than Their Managers
 * author: Ives.He 
 * date: 2022-03-23 23:29:48
 * for TEST copy:
 * import leetcode.editor.en.P181_EmployeesEarningMoreThanTheirManagers .Solution;
 * P181_EmployeesEarningMoreThanTheirManagers_Test
 */
public class P181_EmployeesEarningMoreThanTheirManagers{
    public void info(){
        System.out.println("using sql");
    }
    //There is no code of Java type for this problem
    /**
     * 直覺解題
     * SELECT name 'Employee'
     * FROM(
     *   SELECT
     *     name,
     *     (SELECT case when o.salary > i.salary then 1 else 0 end
     *      FROM Employee i
     *      WHERE i.id = o.managerId
     *     ) flag
     *   FROM Employee o
     *   WHERE managerId is not null
     * )m
     * Where flag = 1
     *
     * Runtime: 891 ms, faster than 93.28% of MS SQL Server online submissions for Employees Earning More Than Their Managers.
     * Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Employees Earning More Than Their Managers.
     */
}