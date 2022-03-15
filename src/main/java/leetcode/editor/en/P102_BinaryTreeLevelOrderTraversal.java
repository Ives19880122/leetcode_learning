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

import leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
    List<List<Integer>> result = new LinkedList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        // 參考簡化
        if(root != null) helper(root,0);
        return result;
    }
    void helper(TreeNode node, int level){
        if(result.size()==level)result.add(new ArrayList<>());
        result.get(level).add(node.val);
        if (node.left != null) helper(node.left,level+1);
        if (node.right != null) helper(node.right,level+1);
    }

}
//leetcode submit region end(Prohibit modification and deletion)


}