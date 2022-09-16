//Given the root of a binary tree, return all root-to-leaf paths in any order. 
//
// A leaf is a node with no children. 
//
// 
// Example 1: 
//
// 
//Input: root = [1,2,3,null,5]
//Output: ["1->2->5","1->3"]
// 
//
// Example 2: 
//
// 
//Input: root = [1]
//Output: ["1"]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [1, 100]. 
// -100 <= Node.val <= 100 
// 
// Related Topics String Backtracking Tree Depth-First Search Binary Tree 👍 485
//0 👎 210
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * id: 257
 * title: Binary Tree Paths
 * author: Ives.He 
 * date: 2022-09-17 01:42:29
 * for TEST copy:
 * import leetcode.editor.en.P257_BinaryTreePaths .Solution;
 * P257_BinaryTreePaths_Test
 */
public class P257_BinaryTreePaths{
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        helper(root,result,String.valueOf(root.val));
        return result;
    }
    private void helper(TreeNode node, List<String> data, String parent){
        if(node.left==null&&node.right==null){
            data.add(parent);
        }
        if(node.left!=null) {
            helper(node.left,data, String.format("%s->%s",parent,String.valueOf(node.left.val)));
        }
        if(node.right!=null){
            helper(node.right,data, String.format("%s->%s",parent,String.valueOf(node.right.val)));
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}