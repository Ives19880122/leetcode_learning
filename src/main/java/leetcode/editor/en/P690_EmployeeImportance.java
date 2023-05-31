//You have a data structure of employee information, including the employee's 
//unique ID, importance value, and direct subordinates' IDs. 
//
// You are given an array of employees employees where: 
//
// 
// employees[i].id is the ID of the iᵗʰ employee. 
// employees[i].importance is the importance value of the iᵗʰ employee. 
// employees[i].subordinates is a list of the IDs of the direct subordinates of 
//the iᵗʰ employee. 
// 
//
// Given an integer id that represents an employee's ID, return the total 
//importance value of this employee and all their direct and indirect subordinates. 
//
// 
// Example 1: 
// 
// 
//Input: employees = [[1,5,[2,3]],[2,3,[]],[3,3,[]]], id = 1
//Output: 11
//Explanation: Employee 1 has an importance value of 5 and has two direct 
//subordinates: employee 2 and employee 3.
//They both have an importance value of 3.
//Thus, the total importance value of employee 1 is 5 + 3 + 3 = 11.
// 
//
// Example 2: 
// 
// 
//Input: employees = [[1,2,[5]],[5,-3,[]]], id = 5
//Output: -3
//Explanation: Employee 5 has an importance value of -3 and has no direct 
//subordinates.
//Thus, the total importance value of employee 5 is -3.
// 
//
// 
// Constraints: 
//
// 
// 1 <= employees.length <= 2000 
// 1 <= employees[i].id <= 2000 
// All employees[i].id are unique. 
// -100 <= employees[i].importance <= 100 
// One employee has at most one direct leader and may have several subordinates.
// 
// The IDs in employees[i].subordinates are valid IDs. 
// 
//
// Related Topics Hash Table Depth-First Search Breadth-First Search 👍 1920 👎 
//1304
    
package leetcode.editor.en;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * id: 690
 * title: Employee Importance
 * author: Ives.He 
 * date: 2023-06-01 01:02:53
 * for TEST copy:
 * import leetcode.editor.en.P690_EmployeeImportance .Solution;
 * P690_EmployeeImportance_Test
 */
public class P690_EmployeeImportance{
    //leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    private int importance = 0;
    private final Map<Integer,Employee> map = new HashMap<>();

    public int getImportance(List<Employee> employees, int id) {
        for(Employee employee: employees){
            this.map.put(employee.id,employee);
        }
        helper(id);
        return this.importance;
    }
    private void helper(int id){
        Employee employee = this.map.get(id);
        this.importance += employee.importance;
        for (Integer subId : employee.subordinates){
            helper(subId);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
}
}