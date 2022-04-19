//You are given the root of a binary search tree (BST), where the values of 
//exactly two nodes of the tree were swapped by mistake. Recover the tree without 
//changing its structure. 
//
// 
// Example 1: 
//
// 
//Input: root = [1,3,null,null,2]
//Output: [3,1,null,null,2]
//Explanation: 3 cannot be a left child of 1 because 3 > 1. Swapping 1 and 3 
//makes the BST valid.
// 
//
// Example 2: 
//
// 
//Input: root = [3,1,4,null,null,2]
//Output: [2,1,4,null,null,3]
//Explanation: 2 cannot be in the right subtree of 3 because 2 < 3. Swapping 2 
//and 3 makes the BST valid.
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [2, 1000]. 
// -2³¹ <= Node.val <= 2³¹ - 1 
// 
//
// 
//Follow up: A solution using O(n) space is pretty straight-forward. Could you 
//devise a constant O(1) space solution? Related Topics Tree Depth-First Search 
//Binary Search Tree Binary Tree 👍 4858 👎 168
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

import java.util.PriorityQueue;

/**
 * id: 99
 * title: Recover Binary Search Tree
 * author: Ives.He 
 * date: 2022-04-19 22:54:16
 * for TEST copy:
 * import leetcode.editor.en.P99_RecoverBinarySearchTree .Solution;
 * P99_RecoverBinarySearchTree_Test
 */
public class P99_RecoverBinarySearchTree{
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
    private TreeNode first = null;
    private TreeNode second = null;
    private TreeNode prev = new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        inOrder(root);
        int tmp = first.val;
        first.val = second.val;
        second.val = tmp;
    }
    // 使用inorder原因, 由小到大排列
    void inOrder(TreeNode node){
        if(node==null)return;
        inOrder(node.left);
        // 如果是空的話, 表示遇到第一個需要調整的節點, 可能為前後節點
        if(first==null&&prev.val>node.val){
            first = prev;
        }
        // 紀錄當下節點
        if(prev.val>node.val){
            second = node;
        }
        prev = node;
        inOrder(node.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}