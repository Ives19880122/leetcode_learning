//Given the root of a Binary Search Tree (BST), return the minimum absolute 
//difference between the values of any two different nodes in the tree. 
//
// 
// Example 1: 
// 
// 
//Input: root = [4,2,6,1,3]
//Output: 1
// 
//
// Example 2: 
// 
// 
//Input: root = [1,0,48,null,null,12,49]
//Output: 1
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [2, 10⁴]. 
// 0 <= Node.val <= 10⁵ 
// 
//
// 
// Note: This question is the same as 783: https://leetcode.com/problems/
//minimum-distance-between-bst-nodes/ 
//
// Related Topics Tree Depth-First Search Breadth-First Search Binary Search 
//Tree Binary Tree 👍 2868 👎 152
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * id: 530
 * title: Minimum Absolute Difference in BST
 * author: Ives.He 
 * date: 2023-06-03 00:17:51
 * for TEST copy:
 * import leetcode.editor.en.P530_MinimumAbsoluteDifferenceInBst .Solution;
 * P530_MinimumAbsoluteDifferenceInBst_Test
 */
public class P530_MinimumAbsoluteDifferenceInBst{
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
    private  TreeNode prev;
    private int min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return min;
    }

    private void dfs(TreeNode node){
        if(node==null) return;
        dfs(node.left);
        if(prev!=null){
            this.min = Math.min(this.min,node.val-prev.val);
        }
        prev=node;
        dfs(node.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}