//Table: Department 
//
// 
//+-------------+---------+
//| Column Name | Type    |
//+-------------+---------+
//| id          | int     |
//| revenue     | int     |
//| month       | varchar |
//+-------------+---------+
//(id, month) is the primary key of this table.
//The table has information about the revenue of each department per month.
//The month has values in ["Jan","Feb","Mar","Apr","May","Jun","Jul","Aug",
//"Sep","Oct","Nov","Dec"].
// 
//
// 
//
// Write an SQL query to reformat the table such that there is a department id 
//column and a revenue column for each month. 
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
//Department table:
//+------+---------+-------+
//| id   | revenue | month |
//+------+---------+-------+
//| 1    | 8000    | Jan   |
//| 2    | 9000    | Jan   |
//| 3    | 10000   | Feb   |
//| 1    | 7000    | Feb   |
//| 1    | 6000    | Mar   |
//+------+---------+-------+
//Output: 
//+------+-------------+-------------+-------------+-----+-------------+
//| id   | Jan_Revenue | Feb_Revenue | Mar_Revenue | ... | Dec_Revenue |
//+------+-------------+-------------+-------------+-----+-------------+
//| 1    | 8000        | 7000        | 6000        | ... | null        |
//| 2    | 9000        | null        | null        | ... | null        |
//| 3    | null        | 10000       | null        | ... | null        |
//+------+-------------+-------------+-------------+-----+-------------+
//Explanation: The revenue from Apr to Dec is null.
//Note that the result table has 13 columns (1 for the department id + 12 for 
//the months).
// 
// Related Topics Database 👍 420 👎 312
    
package leetcode.editor.en;
/** 
 * id: 1179
 * title: Reformat Department Table
 * author: Ives.He 
 * date: 2022-03-24 23:43:13
 * for TEST copy:
 * import leetcode.editor.en.P1179_ReformatDepartmentTable .Solution;
 * P1179_ReformatDepartmentTable_Test
 */
public class P1179_ReformatDepartmentTable{
    public void info(){
        System.out.println("using sql!!");
    }
    //There is no code of Java type for this problem
    /**
     * 解法：使用pivot (sql server)
     * SELECT
     *     id , [Jan] Jan_Revenue, [Feb] Feb_Revenue,
     *     [Mar] Mar_Revenue, [Apr] Apr_Revenue, [May] May_Revenue,
     *     [Jun] Jun_Revenue, [Jul] Jul_Revenue, [Aug] Aug_Revenue,
     *     [Sep] Sep_Revenue, [Oct] Oct_Revenue, [Nov] Nov_Revenue,
     *     [Dec] Dec_Revenue
     * FROM Department
     * PIVOT (SUM(revenue)  for month
     * in([Jan],[Feb],[Mar],[Apr],[May],[Jun],[Jul],[Aug],[Sep],[Oct],[Nov],[Dec]))
     * AS pivotTable
     *
     * Runtime: 1725 ms, faster than 80.79% of MS SQL Server online submissions for Reformat Department Table.
     * Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Reformat Department Table.
     */
}