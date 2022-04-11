//Given the root of a binary tree, invert the tree, and return its root. 
//
// 
// Example 1: 
//
// 
//Input: root = [4,2,7,1,3,6,9]
//Output: [4,7,2,9,6,3,1]
// 
//
// Example 2: 
//
// 
//Input: root = [2,1,3]
//Output: [2,3,1]
// 
//
// Example 3: 
//
// 
//Input: root = []
//Output: []
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 100]. 
// -100 <= Node.val <= 100 
// 
// Related Topics Tree Depth-First Search Breadth-First Search Binary Tree 👍 80
//11 👎 109
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

/**
 * id: 226
 * title: Invert Binary Tree
 * author: Ives.He 
 * date: 2022-04-11 23:09:37
 * for TEST copy:
 * import leetcode.editor.en.P226_InvertBinaryTree .Solution;
 * P226_InvertBinaryTree_Test
 */
public class P226_InvertBinaryTree{
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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}