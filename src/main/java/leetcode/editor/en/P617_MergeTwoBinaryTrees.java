//You are given two binary trees root1 and root2. 
//
// Imagine that when you put one of them to cover the other, some nodes of the 
//two trees are overlapped while the others are not. You need to merge the two 
//trees into a new binary tree. The merge rule is that if two nodes overlap, then sum 
//node values up as the new value of the merged node. Otherwise, the NOT null 
//node will be used as the node of the new tree. 
//
// Return the merged tree. 
//
// Note: The merging process must start from the root nodes of both trees. 
//
// 
// Example 1: 
//
// 
//Input: root1 = [1,3,2,5], root2 = [2,1,3,null,4,null,7]
//Output: [3,4,5,5,4,null,7]
// 
//
// Example 2: 
//
// 
//Input: root1 = [1], root2 = [1,2]
//Output: [2,2]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in both trees is in the range [0, 2000]. 
// -10⁴ <= Node.val <= 10⁴ 
// 
// Related Topics Tree Depth-First Search Breadth-First Search Binary Tree 👍 72
//71 👎 257
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

/**
 * id: 617
 * title: Merge Two Binary Trees
 * author: Ives.He 
 * date: 2022-09-14 21:50:31
 * for TEST copy:
 * import leetcode.editor.en.P617_MergeTwoBinaryTrees .Solution;
 * P617_MergeTwoBinaryTrees_Test
 */
public class P617_MergeTwoBinaryTrees{
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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null && root2 == null) return null;
        else if(root1==null) return root2;
        else if(root2==null) return root1;
        TreeNode tmp = new TreeNode(root1.val+root2.val);
        tmp.left = mergeTrees(root1.left,root2.left);
        tmp.right=mergeTrees(root1.right,root2.right);
        return tmp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}