//Given two integer arrays nums1 and nums2, return an array of their 
//intersection. Each element in the result must appear as many times as it shows in both 
//arrays and you may return the result in any order.
//
// 
// Example 1: 
//
// 
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2,2]
// 
//
// Example 2: 
//
// 
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [4,9]
//Explanation: [9,4] is also accepted.
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums1.length, nums2.length <= 1000 
// 0 <= nums1[i], nums2[i] <= 1000 
// 
//
// 
// Follow up: 
//
// 
// What if the given array is already sorted? How would you optimize your 
//algorithm? 
// What if nums1's size is small compared to nums2's size? Which algorithm is 
//better? 
// What if elements of nums2 are stored on disk, and the memory is limited such 
//that you cannot load all elements into the memory at once? 
// 
// Related Topics Array Hash Table Two Pointers Binary Search Sorting 👍 4217 👎
// 679
    
package leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

/**
 * id: 350
 * title: Intersection of Two Arrays II
 * author: Ives.He 
 * date: 2022-04-04 17:15:00
 * for TEST copy:
 * import leetcode.editor.en.P350_IntersectionOfTwoArraysIi .Solution;
 * P350_IntersectionOfTwoArraysIi_Test
 */
public class P350_IntersectionOfTwoArraysIi{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            for(int k=0; k<nums2.length; k++){
                if(nums1[i]==-1 || nums2[k]==-1){
                    continue;
                }
                if(nums1[i]==nums2[k]){
                    list.add(nums1[i]);
                    nums1[i]=-1;
                    nums2[k]=-1;
                }
            }
        }
        return  list.stream().mapToInt(Integer::intValue).toArray();

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}