//You are given an array of unique integers salary where salary[i] is the 
//salary of the iᵗʰ employee. 
//
// Return the average salary of employees excluding the minimum and maximum 
//salary. Answers within 10⁻⁵ of the actual answer will be accepted. 
//
// 
// Example 1: 
//
// 
//Input: salary = [4000,3000,1000,2000]
//Output: 2500.00000
//Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
//
//Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
// 
//
// Example 2: 
//
// 
//Input: salary = [1000,2000,3000]
//Output: 2000.00000
//Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
//
//Average salary excluding minimum and maximum salary is (2000) / 1 = 2000
// 
//
// 
// Constraints: 
//
// 
// 3 <= salary.length <= 100 
// 1000 <= salary[i] <= 10⁶ 
// All the integers of salary are unique. 
// 
// Related Topics Array Sorting 👍 900 👎 110
    
package leetcode.editor.en;
/** 
 * id: 1491
 * title: Average Salary Excluding the Minimum and Maximum Salary
 * author: Ives.He 
 * date: 2022-09-19 23:20:44
 * for TEST copy:
 * import leetcode.editor.en.P1491_AverageSalaryExcludingTheMinimumAndMaximumSalary .Solution;
 * P1491_AverageSalaryExcludingTheMinimumAndMaximumSalary_Test
 */
public class P1491_AverageSalaryExcludingTheMinimumAndMaximumSalary{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double average(int[] salary) {
        int min = Math.min(salary[0],salary[1]);
        int max = Math.max(salary[0],salary[1]);
        double result = 0.0;
        for(int i = 2; i<salary.length; i++){
            if(salary[i]<min){
                result += min;
                min = salary[i];
            }else if(salary[i]>max){
                result += max;
                max = salary[i];
            }else {
                result += salary[i];
            }
        }
        return result/(salary.length-2);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}