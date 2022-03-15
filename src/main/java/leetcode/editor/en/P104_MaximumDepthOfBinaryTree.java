//Given the root of a binary tree, return its maximum depth. 
//
// A binary tree's maximum depth is the number of nodes along the longest path 
//from the root node down to the farthest leaf node. 
//
// 
// Example 1: 
//
// 
//Input: root = [3,9,20,null,null,15,7]
//Output: 3
// 
//
// Example 2: 
//
// 
//Input: root = [1,null,2]
//Output: 2
// 
//
// Example 3: 
//
// 
//Input: root = []
//Output: 0
// 
//
// Example 4: 
//
// 
//Input: root = [0]
//Output: 1
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 10⁴]. 
// -100 <= Node.val <= 100 
// 
// Related Topics Tree Depth-First Search Breadth-First Search Binary Tree 👍 50
//13 👎 106
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

/**
 * id: 104
 * title: Maximum Depth of Binary Tree
 * author: Ives.He 
 * date: 2021-10-21 23:35:55
 * for TEST copy:
 * import leetcode.editor.en.P104_MaximumDepthOfBinaryTree .Solution;
 * P104_MaximumDepthOfBinaryTree_Test
 */
public class P104_MaximumDepthOfBinaryTree{
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
    public int maxDepth(TreeNode root) {
        // 提供初始值
        return helper(root,0);
    }
    int helper(TreeNode root, int level){
        // 若為空則回傳當下深度
        if(root == null) return level;
        // 若不為空則將深度+1
        if(root != null) level++;
        // 傳入左右樹進行preOrder遍歷,比對得到較大的答案
        return Math.max(helper(root.left,level),helper(root.right,level));
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}