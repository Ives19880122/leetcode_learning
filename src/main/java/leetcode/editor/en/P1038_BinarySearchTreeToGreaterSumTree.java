//Given the root of a Binary Search Tree (BST), convert it to a Greater Tree 
//such that every key of the original BST is changed to the original key plus the 
//sum of all keys greater than the original key in BST. 
//
// As a reminder, a binary search tree is a tree that satisfies these 
//constraints: 
//
// 
// The left subtree of a node contains only nodes with keys less than the 
//node's key. 
// The right subtree of a node contains only nodes with keys greater than the 
//node's key. 
// Both the left and right subtrees must also be binary search trees. 
// 
//
// 
// Example 1: 
// 
// 
//Input: root = [4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
//Output: [30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]
// 
//
// Example 2: 
//
// 
//Input: root = [0,null,1]
//Output: [1,null,1]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [1, 100]. 
// 0 <= Node.val <= 100 
// All the values in the tree are unique. 
// 
//
// 
// Note: This question is the same as 538: https://leetcode.com/problems/
//convert-bst-to-greater-tree/ 
//
// Related Topics Tree Depth-First Search Binary Search Tree Binary Tree 👍 3413
// 👎 146
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

/**
 * id: 1038
 * title: Binary Search Tree to Greater Sum Tree
 * author: Ives.He 
 * date: 2023-06-03 14:33:12
 * for TEST copy:
 * import leetcode.editor.en.P1038_BinarySearchTreeToGreaterSumTree .Solution;
 * P1038_BinarySearchTreeToGreaterSumTree_Test
 */
public class P1038_BinarySearchTreeToGreaterSumTree{
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
    private int max = 0;
    private int acc = 0;
    public TreeNode bstToGst(TreeNode root) {
        sum(root);
        toGST(root);
        return root;
    }
    private void sum(TreeNode node){
        if(node==null) return;
        sum(node.left);
        this.max += node.val;
        sum(node.right);
    }
    private void toGST(TreeNode node){
        if(node==null) return;
        toGST(node.left);
        int tmp = node.val;
        node.val = this.max-this.acc;
        this.acc += tmp;
        toGST(node.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}