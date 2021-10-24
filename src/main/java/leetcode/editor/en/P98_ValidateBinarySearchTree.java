//Given the root of a binary tree, determine if it is a valid binary search 
//tree (BST). 
//
// A valid BST is defined as follows: 
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
//Input: root = [2,1,3]
//Output: true
// 
//
// Example 2: 
//
// 
//Input: root = [5,1,4,null,null,3,6]
//Output: false
//Explanation: The root node's value is 5 but its right child's value is 4.
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [1, 10⁴]. 
// -2³¹ <= Node.val <= 2³¹ - 1 
// 
// Related Topics Tree Depth-First Search Binary Search Tree Binary Tree 👍 7632
// 👎 775
    
package leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * id: 98
 * title: Validate Binary Search Tree
 * author: Ives.He 
 * date: 2021-10-23 23:02:28
 * for TEST copy:
 * import leetcode.editor.en.P98_ValidateBinarySearchTree.Solution;
 * P98_ValidateBinarySearchTree_Test
 */
public class P98_ValidateBinarySearchTree{
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
    Integer oldVal;
    Boolean valid = true;
    public boolean isValidBST(TreeNode root) {
        inorderValid(root);
        return valid;
    }
    void inorderValid(TreeNode node){
        // 使用inorder比對資料,發現前面已經有不合格節點,則不用繼續驗證
        if(node != null && valid==true) {
            isValidBST(node.left);
            // 用Integer oldVal 儲存前一個節點資料進行比對
            if (oldVal!= null && oldVal >= node.val)
                valid = false;
            oldVal = node.val;
            isValidBST(node.right);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}