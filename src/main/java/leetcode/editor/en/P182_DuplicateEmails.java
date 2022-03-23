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
// Write an SQL query to report all the duplicate emails. 
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
//+----+---------+
//| id | email   |
//+----+---------+
//| 1  | a@b.com |
//| 2  | c@d.com |
//| 3  | a@b.com |
//+----+---------+
//Output: 
//+---------+
//| Email   |
//+---------+
//| a@b.com |
//+---------+
//Explanation: a@b.com is repeated two times.
// 
// Related Topics Database 👍 1010 👎 45

package leetcode.editor.en;
/**
  * id：182
  * title：Duplicate Emails
  * author: Ives.He
  * date：2022-03-23 13:02:10
  * for TEST copy:
  * import leetcode.editor.en.P182_DuplicateEmails .Solution;
  * P182_DuplicateEmails_Test
  */
public class P182_DuplicateEmails{
  
  //There is no code of Java type for this problem
    /**
     * 本題使用SQL解
     * SELECT Email FROM Person
     * GROUP BY email
     * HAVING COUNT(email)>1
     */
}