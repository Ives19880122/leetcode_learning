//Given the root of a binary tree, return the bottom-up level order traversal 
//of its nodes' values. (i.e., from left to right, level by level from leaf to root)
//. 
//
// 
// Example 1: 
//
// 
//Input: root = [3,9,20,null,null,15,7]
//Output: [[15,7],[9,20],[3]]
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
// Related Topics Tree Breadth-First Search Binary Tree 👍 2613 👎 261
    
package leetcode.editor.en;

import java.util.*;

/**
 * id: 107
 * title: Binary Tree Level Order Traversal II
 * author: Ives.He 
 * date: 2021-10-24 22:45:19
 * for TEST copy:
 * import leetcode.editor.en.P107_BinaryTreeLevelOrderTraversalIi .Solution;
 * P107_BinaryTreeLevelOrderTraversalIi_Test
 */
public class P107_BinaryTreeLevelOrderTraversalIi{
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
    LinkedList<List<Integer>> stored = new LinkedList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root!=null) helper(root,0);
        List<List<Integer>>result = new ArrayList<>();
        while(!stored.isEmpty()){
            result.add(stored.pollLast());
        }
        return result;
    }
    void helper(TreeNode node,int level){
      if(node!=null){
          if(level==stored.size()){
              stored.add(new ArrayList<>());
          }
          stored.get(level).add(node.val);
          helper(node.left,level+1);
          helper(node.right,level+1);
      }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}