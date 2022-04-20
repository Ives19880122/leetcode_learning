//Given a binary tree, determine if it is height-balanced. 
//
// For this problem, a height-balanced binary tree is defined as: 
//
// 
// a binary tree in which the left and right subtrees of every node differ in 
//height by no more than 1. 
// 
//
// 
// Example 1: 
//
// 
//Input: root = [3,9,20,null,null,15,7]
//Output: true
// 
//
// Example 2: 
//
// 
//Input: root = [1,2,2,3,3,null,null,4,4]
//Output: false
// 
//
// Example 3: 
//
// 
//Input: root = []
//Output: true
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 5000]. 
// -10⁴ <= Node.val <= 10⁴ 
// 
// Related Topics Tree Depth-First Search Binary Tree 👍 5607 👎 305
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

/**
 * id: 110
 * title: Balanced Binary Tree
 * author: Ives.He 
 * date: 2022-04-20 23:34:47
 * for TEST copy:
 * import leetcode.editor.en.P110_BalancedBinaryTree .Solution;
 * P110_BalancedBinaryTree_Test
 */
public class P110_BalancedBinaryTree{
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
    // 確認每個節點都符合平衡規則
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        return nodeCheck(root) && isBalanced(root.left) && isBalanced(root.right);
    }
    // 確認相差是否為1
    private boolean nodeCheck(TreeNode node){
        return Math.abs(deep(node.left,0) - deep(node.right,0)) <= 1;
    }
    // 節點深度探索
    private int deep(TreeNode node, int val){
        if(node==null) return val;
        return Math.max(deep(node.left, val+1),deep(node.right,val+1));
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}