//Given an integer array nums where the elements are sorted in ascending order, 
//convert it to a height-balanced binary search tree. 
//
// A height-balanced binary tree is a binary tree in which the depth of the two 
//subtrees of every node never differs by more than one. 
//
// 
// Example 1: 
//
// 
//Input: nums = [-10,-3,0,5,9]
//Output: [0,-3,9,-10,null,5]
//Explanation: [0,-10,5,null,-3,null,9] is also accepted:
//
// 
//
// Example 2: 
//
// 
//Input: nums = [1,3]
//Output: [3,1]
//Explanation: [1,3] and [3,1] are both a height-balanced BSTs.
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 10⁴ 
// -10⁴ <= nums[i] <= 10⁴ 
// nums is sorted in a strictly increasing order. 
// 
// Related Topics Array Divide and Conquer Tree Binary Search Tree Binary Tree ?
//? 5054 👎 315

package leetcode.editor.en;

import leetcode.util.TreeNode;

/**
  * id：108
  * title：Convert Sorted Array to Binary Search Tree
  * author: Ives.He
  * date：2021-10-20 12:53:12
  * for TEST copy:
  * import leetcode.editor.en.P108_ConvertSortedArrayToBinarySearchTree .Solution;
  * P108_ConvertSortedArrayToBinarySearchTree_Test
  */
public class P108_ConvertSortedArrayToBinarySearchTree{
  
  //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return new TreeNode (0);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
/**
 * 高度平衡二元樹
 * height balanced binary tree
 * 名詞解釋:
 * 一種資料結構。二元樹樹根的左右二子樹為Tl和Tr，且滿足：
 * (1)兩子樹高度最多相差1，即h（Tl）－h（Tr）≦1；
 * (2)Tl和Tr本身也是高度平衡的二元樹。
 * 高度平衡二元樹的節點增加或刪除時，應適當調整其結構使之保持平衡性。
 * 此類二元樹適於電腦資料查找與插入。
 */

}