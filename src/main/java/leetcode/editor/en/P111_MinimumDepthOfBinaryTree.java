//Given a binary tree, find its minimum depth. 
//
// The minimum depth is the number of nodes along the shortest path from the 
//root node down to the nearest leaf node. 
//
// Note: A leaf is a node with no children. 
//
// 
// Example 1: 
//
// 
//Input: root = [3,9,20,null,null,15,7]
//Output: 2
// 
//
// Example 2: 
//
// 
//Input: root = [2,null,3,null,4,null,5,null,6]
//Output: 5
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 10⁵]. 
// -1000 <= Node.val <= 1000 
// 
// Related Topics Tree Depth-First Search Breadth-First Search Binary Tree 👍 31
//67 👎 882
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

/**
 * id: 111
 * title: Minimum Depth of Binary Tree
 * author: Ives.He 
 * date: 2021-10-22 22:02:17
 * for TEST copy:
 * import leetcode.editor.en.P111_MinimumDepthOfBinaryTree .Solution;
 * P111_MinimumDepthOfBinaryTree_Test
 */
public class P111_MinimumDepthOfBinaryTree{
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
    int result = 0;
    public int minDepth(TreeNode root) {
        // 若為空直接回傳0
        if(root!=null) helper(root,1);
        return result;
    }
    void helper(TreeNode root,int level){
        if(root.left !=null) helper(root.left, level + 1);
        if(root.right!=null) helper(root.right, level + 1);
        // 只有在leaf才更新result
        if(root.left==null && root.right == null)
            result = result == 0 ? level : Math.min(result,level);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}