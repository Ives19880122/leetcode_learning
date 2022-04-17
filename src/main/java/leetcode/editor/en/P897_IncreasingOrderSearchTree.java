//Given the root of a binary search tree, rearrange the tree in in-order so 
//that the leftmost node in the tree is now the root of the tree, and every node has 
//no left child and only one right child. 
//
// 
// Example 1: 
//
// 
//Input: root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
//Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
// 
//
// Example 2: 
//
// 
//Input: root = [5,1,7]
//Output: [1,null,5,null,7]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the given tree will be in the range [1, 100]. 
// 0 <= Node.val <= 1000 
// Related Topics Stack Tree Depth-First Search Binary Search Tree Binary Tree ?
//? 2439 👎 601
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * id: 897
 * title: Increasing Order Search Tree
 * author: Ives.He 
 * date: 2022-04-17 11:58:10
 * for TEST copy:
 * import leetcode.editor.en.P897_IncreasingOrderSearchTree .Solution;
 * P897_IncreasingOrderSearchTree_Test
 */
public class P897_IncreasingOrderSearchTree{
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
    private final List<Integer> list = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        helper(root);
        TreeNode result = new TreeNode(-1);
        rightTree(result);
        return result.right;
    }
    private void helper(TreeNode node){
        if(node==null)return;
        helper(node.left);
        list.add(node.val);
        helper(node.right);
    }
    private void rightTree(TreeNode node){
        for(int n : list){
            node.right = new TreeNode(n);
            node = node.right;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}