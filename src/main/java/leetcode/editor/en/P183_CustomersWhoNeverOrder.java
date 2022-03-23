//Table: Customers 
//
// 
//+-------------+---------+
//| Column Name | Type    |
//+-------------+---------+
//| id          | int     |
//| name        | varchar |
//+-------------+---------+
//id is the primary key column for this table.
//Each row of this table indicates the ID and name of a customer.
// 
//
// 
//
// Table: Orders 
//
// 
//+-------------+------+
//| Column Name | Type |
//+-------------+------+
//| id          | int  |
//| customerId  | int  |
//+-------------+------+
//id is the primary key column for this table.
//customerId is a foreign key of the ID from the Customers table.
//Each row of this table indicates the ID of an order and the ID of the 
//customer who ordered it.
// 
//
// 
//
// Write an SQL query to report all customers who never order anything. 
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
//Customers table:
//+----+-------+
//| id | name  |
//+----+-------+
//| 1  | Joe   |
//| 2  | Henry |
//| 3  | Sam   |
//| 4  | Max   |
//+----+-------+
//Orders table:
//+----+------------+
//| id | customerId |
//+----+------------+
//| 1  | 3          |
//| 2  | 1          |
//+----+------------+
//Output: 
//+-----------+
//| Customers |
//+-----------+
//| Henry     |
//| Max       |
//+-----------+
// 
// Related Topics Database 👍 837 👎 69

package leetcode.editor.en;
/**
  * id：183
  * title：Customers Who Never Order
  * author: Ives.He
  * date：2022-03-23 13:22:14
  * for TEST copy:
  * import leetcode.editor.en.P183_CustomersWhoNeverOrder .Solution;
  * P183_CustomersWhoNeverOrder_Test
  */
public class P183_CustomersWhoNeverOrder{
  
  //There is no code of Java type for this problem
    /**
     * 1. 直覺解
     * SELECT name 'Customers'
     * FROM Customers c
     * WHERE not exists(
     *     SELECT TOP 1 1
     *     FROM Orders o
     *     WHERE c.id = o.customerId
     * )
     * Runtime: 2804 ms, faster than 8.41% of MS SQL Server online submissions for Customers Who Never Order.
     * Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Customers Who Never Order.
     *
     * 2. 子查詢:集合剔除主鍵再取得資料
     * SELECT name 'Customers'
     * FROM Customers c
     * WHERE id in (
     *     SELECT id
     *     FROM Customers c
     *     EXCEPT
     *     SELECT id
     *     FROM Customers c
     *     WHERE exists(
     *         SELECT TOP 1 1
     *         FROM Orders o
     *         WHERE c.id = o.customerId
     *     )
     * )
     * Runtime: 946 ms, faster than 65.67% of MS SQL Server online submissions for Customers Who Never Order.
     * Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Customers Who Never Order.
     */
}