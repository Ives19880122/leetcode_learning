//Table: World 
//
// 
//+-------------+---------+
//| Column Name | Type    |
//+-------------+---------+
//| name        | varchar |
//| continent   | varchar |
//| area        | int     |
//| population  | int     |
//| gdp         | int     |
//+-------------+---------+
//name is the primary key column for this table.
//Each row of this table gives information about the name of a country, the 
//continent to which it belongs, its area, the population, and its GDP value.
// 
//
// 
//
// A country is big if: 
//
// 
// it has an area of at least three million (i.e., 3000000 km²), or 
// it has a population of at least twenty-five million (i.e., 25000000). 
// 
//
// Write an SQL query to report the name, population, and area of the big 
//countries. 
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
//World table:
//+-------------+-----------+---------+------------+--------------+
//| name        | continent | area    | population | gdp          |
//+-------------+-----------+---------+------------+--------------+
//| Afghanistan | Asia      | 652230  | 25500100   | 20343000000  |
//| Albania     | Europe    | 28748   | 2831741    | 12960000000  |
//| Algeria     | Africa    | 2381741 | 37100000   | 188681000000 |
//| Andorra     | Europe    | 468     | 78115      | 3712000000   |
//| Angola      | Africa    | 1246700 | 20609294   | 100990000000 |
//+-------------+-----------+---------+------------+--------------+
//Output: 
//+-------------+------------+---------+
//| name        | population | area    |
//+-------------+------------+---------+
//| Afghanistan | 25500100   | 652230  |
//| Algeria     | 37100000   | 2381741 |
//+-------------+------------+---------+
// 
// Related Topics Database 👍 709 👎 872

package leetcode.editor.en;
/**
  * id：595
  * title：Big Countries
  * author: Ives.He
  * date：2022-03-24 13:17:20
  * for TEST copy:
  * import leetcode.editor.en.P595_BigCountries .Solution;
  * P595_BigCountries_Test
  */
public class P595_BigCountries{
  public void info(){
      System.out.println("using SQL");
  }
  //There is no code of Java type for this problem
    /**
     * 1. 直覺查詢
     * select name, population, area from World where area >= '3000000' or population >= '25000000'
     * Runtime: 1751 ms , 43.64%
     * Memory Usage: 0B
     *
     * 2. case when
     * select
     *  name, population, area
     * from(
     *  SELECT * ,
     *  CASE
     *     WHEN area >= '3000000' or population >= '25000000'
     *     THEN 1 ELSE 0 END big
     *  FROM World
     *  )m
     *  where big= 1
     * Runtime: 1416 ms, 64.12%
     * Memory Usage: 0B
     *
     * 3. union
     * select name, population, area from world where area >= '3000000'
     * union
     * SELECT name, population, area from world where
     * population >= '25000000'
     * Runtime: 1267 ms, 77.48%
     * Memory Usage: 0B
     */
}