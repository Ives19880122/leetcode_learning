//Given a non-negative integer c, decide whether there're two integers a and b 
//such that a² + b² = c. 
//
// 
// Example 1: 
//
// 
//Input: c = 5
//Output: true
//Explanation: 1 * 1 + 2 * 2 = 5
// 
//
// Example 2: 
//
// 
//Input: c = 3
//Output: false
// 
//
// 
// Constraints: 
//
// 
// 0 <= c <= 2³¹ - 1 
// 
//
// Related Topics Math Two Pointers Binary Search 👍 1791 👎 496
    
package leetcode.editor.en;
/** 
 * id: 633
 * title: Sum of Square Numbers
 * author: Ives.He 
 * date: 2022-10-20 23:49:49
 * for TEST copy:
 * import leetcode.editor.en.P633_SumOfSquareNumbers .Solution;
 * P633_SumOfSquareNumbers_Test
 */
public class P633_SumOfSquareNumbers{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean judgeSquareSum(int c) {
        int sqC = (int)Math.sqrt(c);
        for (int i = sqC; i >=0 ; i--) {
            int res = binarySearch(0,i,c);
            if(res>=0) return true;
        }
        return false;
    }

    public int binarySearch(int start, int end, int target){
        int valueR = (int)Math.pow(end,2);
        while(start<=end){
            int mid = start + (end-start)/2;
            int valueL = (int) Math.pow(mid,2);
            // 防止溢位
            if(Integer.MAX_VALUE-valueR<valueL || target<valueL+valueR) end = mid-1;
            else if(target>valueL+valueR) start = mid+1;
            else return mid;
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}