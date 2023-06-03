//There are n kids with candies. You are given an integer array candies, where 
//each candies[i] represents the number of candies the iᵗʰ kid has, and an integer 
//extraCandies, denoting the number of extra candies that you have. 
//
// Return a boolean array result of length n, where result[i] is true if, after 
//giving the iᵗʰ kid all the extraCandies, they will have the greatest number of 
//candies among all the kids, or false otherwise. 
//
// Note that multiple kids can have the greatest number of candies. 
//
// 
// Example 1: 
//
// 
//Input: candies = [2,3,5,1,3], extraCandies = 3
//Output: [true,true,true,false,true] 
//Explanation: If you give all extraCandies to:
//- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the 
//kids.
//- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the 
//kids.
//- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the 
//kids.
//- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among 
//the kids.
//- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the 
//kids.
// 
//
// Example 2: 
//
// 
//Input: candies = [4,2,1,1,2], extraCandies = 1
//Output: [true,false,false,false,false] 
//Explanation: There is only 1 extra candy.
//Kid 1 will always have the greatest number of candies, even if a different 
//kid is given the extra candy.
// 
//
// Example 3: 
//
// 
//Input: candies = [12,1,12], extraCandies = 10
//Output: [true,false,true]
// 
//
// 
// Constraints: 
//
// 
// n == candies.length 
// 2 <= n <= 100 
// 1 <= candies[i] <= 100 
// 1 <= extraCandies <= 50 
// 
//
// Related Topics Array 👍 3383 👎 401
    
package leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

/**
 * id: 1431
 * title: Kids With the Greatest Number of Candies
 * author: Ives.He 
 * date: 2023-06-03 16:28:16
 * for TEST copy:
 * import leetcode.editor.en.P1431_KidsWithTheGreatestNumberOfCandies .Solution;
 * P1431_KidsWithTheGreatestNumberOfCandies_Test
 */
public class P1431_KidsWithTheGreatestNumberOfCandies{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int max = maxValue(candies);
            List<Boolean> result = new ArrayList<>();
            for(int d : candies){
                result.add(d+extraCandies >= max);
            }
            return result;
        }

        public int maxValue(int[] candies){
            int max = candies[0];
            for(int d : candies){
                max = Math.max(d,max);
            }
            return max;
        }
}
//leetcode submit region end(Prohibit modification and deletion)

}