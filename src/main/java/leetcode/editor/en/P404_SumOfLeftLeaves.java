//Given the root of a binary tree, return the sum of all left leaves. 
//
// A leaf is a node with no children. A left leaf is a leaf that is the left 
//child of another node. 
//
// 
// Example 1: 
//
// 
//Input: root = [3,9,20,null,null,15,7]
//Output: 24
//Explanation: There are two left leaves in the binary tree, with values 9 and 1
//5 respectively.
// 
//
// Example 2: 
//
// 
//Input: root = [1]
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [1, 1000]. 
// -1000 <= Node.val <= 1000 
// 
// Related Topics Tree Depth-First Search Breadth-First Search Binary Tree 👍 32
//34 👎 244
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * id: 404
 * title: Sum of Left Leaves
 * author: Ives.He 
 * date: 2022-04-16 20:35:42
 * for TEST copy:
 * import leetcode.editor.en.P404_SumOfLeftLeaves .Solution;
 * P404_SumOfLeftLeaves_Test
 */
public class P404_SumOfLeftLeaves{
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
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode parent = queue.remove();
            if(parent.left!=null && isLeaf(parent.left)) sum += parent.left.val;
            if(parent.left!=null)queue.add(parent.left);
            if(parent.right!=null)queue.add(parent.right);
        }
        return sum;
    }
    private boolean isLeaf(TreeNode node){
        return node.left == null && node.right == null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}