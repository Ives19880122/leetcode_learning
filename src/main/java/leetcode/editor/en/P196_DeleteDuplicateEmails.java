//Table: Person 
//
// 
//+-------------+---------+
//| Column Name | Type    |
//+-------------+---------+
//| id          | int     |
//| email       | varchar |
//+-------------+---------+
//id is the primary key column for this table.
//Each row of this table contains an email. The emails will not contain 
//uppercase letters.
// 
//
// 
//
// Write an SQL query to delete all the duplicate emails, keeping only one 
//unique email with the smallest id. Note that you are supposed to write a DELETE 
//statement and not a SELECT one. 
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
//Person table:
//+----+------------------+
//| id | email            |
//+----+------------------+
//| 1  | john@example.com |
//| 2  | bob@example.com  |
//| 3  | john@example.com |
//+----+------------------+
//Output: 
//+----+------------------+
//| id | email            |
//+----+------------------+
//| 1  | john@example.com |
//| 2  | bob@example.com  |
//+----+------------------+
//Explanation: john@example.com is repeated two times. We keep the row with the 
//smallest Id = 1.
// 
// Related Topics Database 👍 774 👎 1246
    
package leetcode.editor.en;
/** 
 * id: 196
 * title: Delete Duplicate Emails
 * author: Ives.He 
 * date: 2022-03-23 22:44:31
 * for TEST copy:
 * import leetcode.editor.en.P196_DeleteDuplicateEmails .Solution;
 * P196_DeleteDuplicateEmails_Test
 */
public class P196_DeleteDuplicateEmails{
    public void info(){
        System.out.println("using sql by oracle");
    }
    //There is no code of Java type for this problem
    /**
     * DELETE FROM Person
     * WHERE id in (
     *  SELECT id
     *  FROM (
     *     SELECT id, rank() over(partition by email order by id asc) rank FROM Person
     *  ) m
     *  WHERE rank > 1
     * );
     *
     * Runtime: 909 ms, faster than 40.00% of Oracle online submissions for Delete Duplicate Emails.
     * Memory Usage: 0B, less than 100.00% of Oracle online submissions for Delete Duplicate Emails.
     *
     * 解2 改用 except / minus加速
     * DELETE FROM Person
     * WHERE id in (
     *  SELECT id FROM Person
     *  minus
     *  SELECT min(id) FROM Person GROUP BY email
     * );
     *
     * Runtime: 793 ms, faster than 80.00% of Oracle online submissions for Delete Duplicate Emails.
     * Memory Usage: 0B, less than 100.00% of Oracle online submissions for Delete Duplicate Emails.
     *
     */
}