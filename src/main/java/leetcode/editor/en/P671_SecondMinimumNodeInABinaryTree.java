//Given a non-empty special binary tree consisting of nodes with the non-
//negative value, where each node in this tree has exactly two or zero sub-node. If the 
//node has two sub-nodes, then this node's value is the smaller value among its 
//two sub-nodes. More formally, the property root.val = min(root.left.val, root.
//right.val) always holds. 
//
// Given such a binary tree, you need to output the second minimum value in the 
//set made of all the nodes' value in the whole tree. 
//
// If no such second minimum value exists, output -1 instead. 
//
// 
//
// 
// Example 1: 
// 
// 
//Input: root = [2,2,5,null,null,5,7]
//Output: 5
//Explanation: The smallest value is 2, the second smallest value is 5.
// 
//
// Example 2: 
// 
// 
//Input: root = [2,2,2]
//Output: -1
//Explanation: The smallest value is 2, but there isn't any second smallest 
//value.
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [1, 25]. 
// 1 <= Node.val <= 2³¹ - 1 
// root.val == min(root.left.val, root.right.val) for each internal node of the 
//tree. 
// 
//
// Related Topics Tree Depth-First Search Binary Tree 👍 1638 👎 1772
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * id: 671
 * title: Second Minimum Node In a Binary Tree
 * author: Ives.He 
 * date: 2023-06-02 23:11:04
 * for TEST copy:
 * import leetcode.editor.en.P671_SecondMinimumNodeInABinaryTree .Solution;
 * P671_SecondMinimumNodeInABinaryTree_Test
 */
public class P671_SecondMinimumNodeInABinaryTree{
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
    int min;
    long val = Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        min = root.val;
        dfs(root);
        return val<Long.MAX_VALUE ? (int) val : -1;
    }
    private void dfs(TreeNode node){
        if(node==null) return;
        if(min < node.val && node.val < val){
            val = node.val;
        } else if(min == node.val){
            dfs(node.left);
            dfs(node.right);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}