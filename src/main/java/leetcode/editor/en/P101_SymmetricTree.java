//Given the root of a binary tree, check whether it is a mirror of itself (i.e.,
// symmetric around its center). 
//
// 
// Example 1: 
//
// 
//Input: root = [1,2,2,3,4,4,3]
//Output: true
// 
//
// Example 2: 
//
// 
//Input: root = [1,2,2,null,3,null,3]
//Output: false
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [1, 1000]. 
// -100 <= Node.val <= 100 
// 
//
// 
//Follow up: Could you solve it both recursively and iteratively? Related 
//Topics Tree Depth-First Search Breadth-First Search Binary Tree 👍 7581 👎 192

package leetcode.editor.en;

import java.util.Stack;

/**
 * id: 101
 * title: Symmetric Tree
 * author: Ives.He
 * date: 2021-10-17 10:06:45
 * for TEST copy:
 * import leetcode.editor.en.P101_SymmetricTree .Solution;
 * P101_SymmetricTree_Test
 */
public class P101_SymmetricTree {
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            TreeNode r = root.right;
            Stack<TreeNode> tmr = new Stack<>();
            TreeNode l = root.left;
            Stack<TreeNode> tml = new Stack<>();
            while (r != null || l != null || (!tml.empty() && !tml.empty())) {
                if (r != null && l != null && r.val == l.val) {
                    tml.push(l.right);
                    l = l.left;
                    tmr.push(r.left);
                    r = r.right;
                } else if (r == null && l == null && !tml.isEmpty() && !tmr.isEmpty()) {
                    l = tml.pop();
                    r = tmr.pop();
                } else {
                    return false;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}