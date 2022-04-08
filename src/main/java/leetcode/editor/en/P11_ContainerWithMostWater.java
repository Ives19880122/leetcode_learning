//You are given an integer array height of length n. There are n vertical lines 
//drawn such that the two endpoints of the iᵗʰ line are (i, 0) and (i, height[i]).
// 
//
// Find two lines that together with the x-axis form a container, such that the 
//container contains the most water. 
//
// Return the maximum amount of water a container can store. 
//
// Notice that you may not slant the container. 
//
// 
// Example 1: 
//
// 
//Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49
//Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,
//3,7]. In this case, the max area of water (blue section) the container can 
//contain is 49.
// 
//
// Example 2: 
//
// 
//Input: height = [1,1]
//Output: 1
// 
//
// 
// Constraints: 
//
// 
// n == height.length 
// 2 <= n <= 10⁵ 
// 0 <= height[i] <= 10⁴ 
// 
// Related Topics Array Two Pointers Greedy 👍 16293 👎 921
    
package leetcode.editor.en;
/** 
 * id: 11
 * title: Container With Most Water
 * author: Ives.He 
 * date: 2022-04-09 02:22:32
 * for TEST copy:
 * import leetcode.editor.en.P11_ContainerWithMostWater .Solution;
 * P11_ContainerWithMostWater_Test
 */
public class P11_ContainerWithMostWater{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxArea(int[] height) {
        int result=0;
        // 參考使用雙指標逼近
        int l = 0;
        int r = height.length - 1;
        while(r>l){
            result = Math.max((r-l)*Math.min(height[l],height[r]),result);
            if(height[r]>height[l]){
                l++;
            }else{
                r--;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}