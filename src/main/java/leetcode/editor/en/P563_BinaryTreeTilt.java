//Given the root of a binary tree, return the sum of every tree node's tilt. 
//
// The tilt of a tree node is the absolute difference between the sum of all 
//left subtree node values and all right subtree node values. If a node does not 
//have a left child, then the sum of the left subtree node values is treated as 0. 
//The rule is similar if the node does not have a right child. 
//
// 
// Example 1: 
// 
// 
//Input: root = [1,2,3]
//Output: 1
//Explanation: 
//Tilt of node 2 : |0-0| = 0 (no children)
//Tilt of node 3 : |0-0| = 0 (no children)
//Tilt of node 1 : |2-3| = 1 (left subtree is just left child, so sum is 2; 
//right subtree is just right child, so sum is 3)
//Sum of every tilt : 0 + 0 + 1 = 1
// 
//
// Example 2: 
// 
// 
//Input: root = [4,2,9,3,5,null,7]
//Output: 15
//Explanation: 
//Tilt of node 3 : |0-0| = 0 (no children)
//Tilt of node 5 : |0-0| = 0 (no children)
//Tilt of node 7 : |0-0| = 0 (no children)
//Tilt of node 2 : |3-5| = 2 (left subtree is just left child, so sum is 3; 
//right subtree is just right child, so sum is 5)
//Tilt of node 9 : |0-7| = 7 (no left child, so sum is 0; right subtree is just 
//right child, so sum is 7)
//Tilt of node 4 : |(3+5+2)-(9+7)| = |10-16| = 6 (left subtree values are 3, 5, 
//and 2, which sums to 10; right subtree values are 9 and 7, which sums to 16)
//Sum of every tilt : 0 + 0 + 0 + 2 + 7 + 6 = 15
// 
//
// Example 3: 
// 
// 
//Input: root = [21,7,14,1,1,2,2,3,3]
//Output: 9
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 10⁴]. 
// -1000 <= Node.val <= 1000 
// 
//
// Related Topics Tree Depth-First Search Binary Tree 👍 2036 👎 2088
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

/**
 * id: 563
 * title: Binary Tree Tilt
 * author: Ives.He 
 * date: 2023-06-04 20:54:44
 * for TEST copy:
 * import leetcode.editor.en.P563_BinaryTreeTilt .Solution;
 * P563_BinaryTreeTilt_Test
 */
public class P563_BinaryTreeTilt{
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
    public int findTilt(TreeNode root) {
        int[] dp = new int[1];
        sum(root,dp);
        return dp[0];
    }
    // return負責計算TreeNode的總和, dp保留tilt計算結果
    private int sum(TreeNode node, int[]dp){
        if(node==null) return 0;
        int l = sum(node.left,dp);
        int r = sum(node.right,dp);
        dp[0] += Math.abs(l-r);
        return l+r+node.val;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}