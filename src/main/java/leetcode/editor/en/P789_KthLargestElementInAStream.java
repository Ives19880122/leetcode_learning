//Design a class to find the kᵗʰ largest element in a stream. Note that it is 
//the kᵗʰ largest element in the sorted order, not the kᵗʰ distinct element. 
//
// Implement KthLargest class: 
//
// 
// KthLargest(int k, int[] nums) Initializes the object with the integer k and 
//the stream of integers nums. 
// int add(int val) Appends the integer val to the stream and returns the 
//element representing the kᵗʰ largest element in the stream. 
// 
//
// 
// Example 1: 
//
// 
//Input
//["KthLargest", "add", "add", "add", "add", "add"]
//[[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
//Output
//[null, 4, 5, 5, 8, 8]
//
//Explanation
//KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);
//kthLargest.add(3);   // return 4
//kthLargest.add(5);   // return 5
//kthLargest.add(10);  // return 5
//kthLargest.add(9);   // return 8
//kthLargest.add(4);   // return 8
// 
//
// 
// Constraints: 
//
// 
// 1 <= k <= 10⁴ 
// 0 <= nums.length <= 10⁴ 
// -10⁴ <= nums[i] <= 10⁴ 
// -10⁴ <= val <= 10⁴ 
// At most 10⁴ calls will be made to add. 
// It is guaranteed that there will be at least k elements in the array when 
//you search for the kᵗʰ element. 
// 
// Related Topics Tree Design Binary Search Tree Heap (Priority Queue) Binary 
//Tree Data Stream 👍 1657 👎 987

package leetcode.editor.en;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
  * id：789
  * title：Kth Largest Element in a Stream
  * author: Ives.He
  * date：2021-11-01 12:34:18
  * for TEST copy:
  * import leetcode.editor.en.P789_KthLargestElementInAStream .Solution;
  * P789_KthLargestElementInAStream_Test
  */
public class P789_KthLargestElementInAStream{
  
  //leetcode submit region begin(Prohibit modification and deletion)
class KthLargest {
      int n;
      List<Integer> list;
      public KthLargest(int k, int[] nums) {
          this.n = k-1;
          this.list = Arrays.stream(nums)
                  .boxed()
                  .collect(Collectors.toList());
      }

      public int add(int val) {
          this.list.add(val);
          sorted();
          return list.get(n);
      }

      void sorted(){
          this.list = list.stream()
                  .sorted((x,y)-> -x.compareTo(y))
                  .collect(Collectors.toList());
      }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
//leetcode submit region end(Prohibit modification and deletion)


}