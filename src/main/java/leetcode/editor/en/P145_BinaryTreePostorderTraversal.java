//Given the root of a binary tree, return the postorder traversal of its nodes' 
//values. 
//
// 
// Example 1: 
//
// 
//Input: root = [1,null,2,3]
//Output: [3,2,1]
// 
//
// Example 2: 
//
// 
//Input: root = []
//Output: []
// 
//
// Example 3: 
//
// 
//Input: root = [1]
//Output: [1]
// 
//
// Example 4: 
//
// 
//Input: root = [1,2]
//Output: [2,1]
// 
//
// Example 5: 
//
// 
//Input: root = [1,null,2]
//Output: [2,1]
// 
//
// 
// Constraints: 
//
// 
// The number of the nodes in the tree is in the range [0, 100]. 
// -100 <= Node.val <= 100 
// 
//
// 
//Follow up: Recursive solution is trivial, could you do it iteratively? 
//Related Topics Stack Tree Depth-First Search Binary Tree 👍 3250 👎 125
    
package leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

/**
 * id: 145
 * title: Binary Tree Postorder Traversal
 * author: Ives.He 
 * date: 2021-10-20 23:09:58
 * for TEST copy:
 * import leetcode.editor.en.P145_BinaryTreePostorderTraversal .Solution;
 * P145_BinaryTreePostorderTraversal_Test
 */
public class P145_BinaryTreePostorderTraversal{
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root!=null) helper(root,list);
        return list;
    }
    void helper(TreeNode r, List<Integer> list){
        if(r!=null){
            helper(r.left,list);
            helper(r.right,list);
            list.add(r.val);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}