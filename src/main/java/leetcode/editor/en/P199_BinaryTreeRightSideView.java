//Given the root of a binary tree, imagine yourself standing on the right side 
//of it, return the values of the nodes you can see ordered from top to bottom. 
//
// 
// Example 1: 
// 
// 
//Input: root = [1,2,3,null,5,null,4]
//Output: [1,3,4]
// 
//
// Example 2: 
//
// 
//Input: root = [1,null,3]
//Output: [1,3]
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
// The number of nodes in the tree is in the range [0, 100]. 
// -100 <= Node.val <= 100 
// 
//
// Related Topics Tree Depth-First Search Breadth-First Search Binary Tree 👍 10
//006 👎 607
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * id: 199
 * title: Binary Tree Right Side View
 * author: Ives.He 
 * date: 2023-05-31 22:01:59
 * for TEST copy:
 * import leetcode.editor.en.P199_BinaryTreeRightSideView .Solution;
 * P199_BinaryTreeRightSideView_Test
 */
public class P199_BinaryTreeRightSideView{
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root,0,result);
        return result;
    }
    void helper(TreeNode node, int level, List<Integer> list){
        if(node==null) return;
        if(list.size()==level) list.add(node.val);
        helper(node.right,level+1,list);
        helper(node.left,level+1,list);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}