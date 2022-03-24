//Table: Logs 
//
// 
//+-------------+---------+
//| Column Name | Type    |
//+-------------+---------+
//| id          | int     |
//| num         | varchar |
//+-------------+---------+
//id is the primary key for this table.
// 
//
// 
//
// Write an SQL query to find all numbers that appear at least three times 
//consecutively. 
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
//Logs table:
//+----+-----+
//| id | num |
//+----+-----+
//| 1  | 1   |
//| 2  | 1   |
//| 3  | 1   |
//| 4  | 2   |
//| 5  | 1   |
//| 6  | 2   |
//| 7  | 2   |
//+----+-----+
//Output: 
//+-----------------+
//| ConsecutiveNums |
//+-----------------+
//| 1               |
//+-----------------+
//Explanation: 1 is the only number that appears consecutively for at least 
//three times.
// 
// Related Topics Database 👍 938 👎 182
    
package leetcode.editor.en;
/** 
 * id: 180
 * title: Consecutive Numbers
 * author: Ives.He 
 * date: 2022-03-25 00:03:43
 * for TEST copy:
 * import leetcode.editor.en.P180_ConsecutiveNumbers .Solution;
 * P180_ConsecutiveNumbers_Test
 */
public class P180_ConsecutiveNumbers{
    public void info(){
        System.out.println("using sql!");
    }
    //There is no code of Java type for this problem
    /**
     * 解題:使用lag,lead 取得 prev / next
     * SELECT cur ConsecutiveNums
     * FROM(
     *     SELECT
     *         num cur,
     *         lag(num) over (order by id) prev,
     *         lead(num) over (order by id) next
     *     FROM Logs
     * )m
     * WHERE cur = prev and next = cur
     * GROUP BY cur
     *
     * Runtime: 1324 ms, faster than 55.13% of MS SQL Server online submissions for Consecutive Numbers.
     * Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Consecutive Numbers.
     */
}