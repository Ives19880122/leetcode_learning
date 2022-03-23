//Table: Weather 
//
// 
//+---------------+---------+
//| Column Name   | Type    |
//+---------------+---------+
//| id            | int     |
//| recordDate    | date    |
//| temperature   | int     |
//+---------------+---------+
//id is the primary key for this table.
//This table contains information about the temperature on a certain day.
// 
//
// 
//
// Write an SQL query to find all dates' Id with higher temperatures compared 
//to its previous dates (yesterday). 
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
//Weather table:
//+----+------------+-------------+
//| id | recordDate | temperature |
//+----+------------+-------------+
//| 1  | 2015-01-01 | 10          |
//| 2  | 2015-01-02 | 25          |
//| 3  | 2015-01-03 | 20          |
//| 4  | 2015-01-04 | 30          |
//+----+------------+-------------+
//Output: 
//+----+
//| id |
//+----+
//| 2  |
//| 4  |
//+----+
//Explanation: 
//In 2015-01-02, the temperature was higher than the previous day (10 -> 25).
//In 2015-01-04, the temperature was higher than the previous day (20 -> 30).
// 
// Related Topics Database 👍 827 👎 347
    
package leetcode.editor.en;
/** 
 * id: 197
 * title: Rising Temperature
 * author: Ives.He 
 * date: 2022-03-24 00:11:18
 * for TEST copy:
 * import leetcode.editor.en.P197_RisingTemperature .Solution;
 * P197_RisingTemperature_Test
 */
public class P197_RisingTemperature{
    public void info(){
        System.out.println("using sql");
    }
    //There is no code of Java type for this problem
    /**
     * 1. 直覺解 (注意一定要抓昨天!!)
     * SELECT id FROM(
     *  SELECT
     *   id,
     *   (SELECT temperature FROM Weather i WHERE i.recordDate = DATEAdd(day,-1,o.recordDate)) prev,
     *   temperature curr
     *  FROM Weather o
     * ) m
     * WHERE prev is not null and curr > prev
     *
     * Runtime: 2455 ms, faster than 13.75% of MS SQL Server online submissions for Rising Temperature.
     * Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Rising Temperature.
     *
     * 2. 解二 where減少部分運算
     * SELECT id FROM(
     *  SELECT
     *   id,
     *   case when temperature > LAG(temperature) over (order by recordDate) THEN 1 ELSE 0 END higher,
     *   case when LAG(recordDate) over (order by recordDate) = dateAdd(day,-1,recordDate) THEN 1 ELSE 0 END isYesterDay
     *  FROM Weather
     * ) m
     * WHERE higher = 1 and isYesterDay = 1
     *
     * Runtime: 1421 ms, faster than 42.12% of MS SQL Server online submissions for Rising Temperature.
     * Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Rising Temperature.
     *
     * 3. 解三 join解
     * SELECT i.id
     * FROM Weather i
     * INNER JOIN Weather o ON o.recordDate = dateAdd(day,-1,i.recordDate)
     * WHERE i.temperature > o.temperature
     * Runtime: 1182 ms, faster than 58.77% of MS SQL Server online submissions for Rising Temperature.
     * Memory Usage: 0B, less than 100.00% of MS SQL Server online submissions for Rising Temperature.
     */
}