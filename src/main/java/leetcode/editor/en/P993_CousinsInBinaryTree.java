//Given the root of a binary tree with unique values and the values of two 
//different nodes of the tree x and y, return true if the nodes corresponding to the 
//values x and y in the tree are cousins, or false otherwise. 
//
// Two nodes of a binary tree are cousins if they have the same depth with 
//different parents. 
//
// Note that in a binary tree, the root node is at the depth 0, and children of 
//each depth k node are at the depth k + 1. 
//
// 
// Example 1: 
// 
// 
//Input: root = [1,2,3,4], x = 4, y = 3
//Output: false
// 
//
// Example 2: 
// 
// 
//Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
//Output: true
// 
//
// Example 3: 
// 
// 
//Input: root = [1,2,3,null,4], x = 2, y = 3
//Output: false
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [2, 100]. 
// 1 <= Node.val <= 100 
// Each node has a unique value. 
// x != y 
// x and y are exist in the tree. 
// 
//
// Related Topics Tree Depth-First Search Breadth-First Search Binary Tree 👍 35
//74 👎 176
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

/**
 * id: 993
 * title: Cousins in Binary Tree
 * author: Ives.He 
 * date: 2023-06-05 22:42:41
 * for TEST copy:
 * import leetcode.editor.en.P993_CousinsInBinaryTree .Solution;
 * P993_CousinsInBinaryTree_Test
 */
public class P993_CousinsInBinaryTree{
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
    public boolean isCousins(TreeNode root, int x, int y) {
        int[] dp1 = new int[2];
        int[] dp2 = new int[2];
        findDeepAndParent(root.left,dp1,x,1,root.val);
        findDeepAndParent(root.left,dp2,y,1,root.val);
        findDeepAndParent(root.right,dp1,x,1,root.val);
        findDeepAndParent(root.right,dp2,y,1,root.val);
        return dp1[0] == dp2[0] && dp1[1] != dp2[1];
    }

    public void findDeepAndParent(TreeNode node, int[] dp, int target, int level, int parent){
        if(node==null) return;
        if(node.val == target) {
            dp[0] = level;
            dp[1] = parent;
            return;
        }
        findDeepAndParent(node.left,dp,target,level+1,node.val);
        findDeepAndParent(node.right,dp,target,level+1,node.val);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}