//Given the root of a binary search tree, and an integer k, return the kᵗʰ 
//smallest value (1-indexed) of all the values of the nodes in the tree. 
//
// 
// Example 1: 
//
// 
//Input: root = [3,1,4,null,2], k = 1
//Output: 1
// 
//
// Example 2: 
//
// 
//Input: root = [5,3,6,2,4,null,null,1], k = 3
//Output: 3
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is n. 
// 1 <= k <= n <= 10⁴ 
// 0 <= Node.val <= 10⁴ 
// 
//
// 
// Follow up: If the BST is modified often (i.e., we can do insert and delete 
//operations) and you need to find the kth smallest frequently, how would you 
//optimize? 
// Related Topics Tree Depth-First Search Binary Search Tree Binary Tree 👍 6662
// 👎 127
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

/**
 * id: 230
 * title: Kth Smallest Element in a BST
 * author: Ives.He 
 * date: 2022-04-18 22:40:45
 * for TEST copy:
 * import leetcode.editor.en.P230_KthSmallestElementInABst .Solution;
 * P230_KthSmallestElementInABst_Test
 */
public class P230_KthSmallestElementInABst{
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
    private int result = 0;
    private int k;
    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        // inOrder Traversal
        helper(root);
        return result;
    }
    void helper(TreeNode node){
        if(node==null)return;
        helper(node.left);
        this.k--;
        if(k==0) {
            this.result = node.val;
            return;
        }
        helper(node.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}