//Given the root of a binary tree, return the level order traversal of its 
//nodes' values. (i.e., from left to right, level by level). 
//
// 
// Example 1: 
//
// 
//Input: root = [3,9,20,null,null,15,7]
//Output: [[3],[9,20],[15,7]]
// 
//
// Example 2: 
//
// 
//Input: root = [1]
//Output: [[1]]
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
// The number of nodes in the tree is in the range [0, 2000]. 
// -1000 <= Node.val <= 1000 
// 
// Related Topics Tree Breadth-First Search Binary Tree 👍 6129 👎 127

package leetcode.editor.en;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
  * id：102
  * title：Binary Tree Level Order Traversal
  * author: Ives.He
  * date：2021-10-21 13:07:23
  * for TEST copy:
  * import leetcode.editor.en.P102_BinaryTreeLevelOrderTraversal .Solution;
  * P102_BinaryTreeLevelOrderTraversal_Test
  */
public class P102_BinaryTreeLevelOrderTraversal{
  
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        // 遞迴改寫
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        helper(que,result);
        return result;
    }
    void helper(Queue<TreeNode>que, List<List<Integer>> result){
        if(!que.isEmpty()) {
            // stored each level
            List<Integer> stored = new ArrayList<>();
            int end = que.size();
            // iterator all same level elements
            for (int i = 0; i < end; i++) {
                // 取出當前結果
                TreeNode tmp = que.poll();
                stored.add(tmp.val);
                if (tmp.left != null) {
                    que.offer(tmp.left);
                }
                if (tmp.right != null) {
                    que.offer(tmp.right);
                }
            }
            result.add(stored);
            helper(que,result);
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)


}