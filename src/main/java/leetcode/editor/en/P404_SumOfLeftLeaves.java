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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        int sum = 0;
        // 調整遞迴解
        if(root.left != null){
            // 踩到left leaf
            if(root.left.left == null && root.left.right == null) sum += root.left.val;
            // 繼續往左樹搜尋
            else sum += sumOfLeftLeaves(root.left);
        }
        // 右樹往下搜尋,遞迴是否有左邊節點
        sum += sumOfLeftLeaves(root.right);
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}