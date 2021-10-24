//Given a binary tree, find the lowest common ancestor (LCA) of two given nodes 
//in the tree. 
//
// According to the definition of LCA on Wikipedia: “The lowest common ancestor 
//is defined between two nodes p and q as the lowest node in T that has both p 
//and q as descendants (where we allow a node to be a descendant of itself).” 
//
// 
// Example 1: 
//
// 
//Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
//Output: 3
//Explanation: The LCA of nodes 5 and 1 is 3.
// 
//
// Example 2: 
//
// 
//Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
//Output: 5
//Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant 
//of itself according to the LCA definition.
// 
//
// Example 3: 
//
// 
//Input: root = [1,2], p = 1, q = 2
//Output: 1
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [2, 10⁵]. 
// -10⁹ <= Node.val <= 10⁹ 
// All Node.val are unique. 
// p != q 
// p and q will exist in the tree. 
// 
// Related Topics Tree Depth-First Search Binary Tree 👍 7528 👎 230
    
package leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

/**
 * id: 236
 * title: Lowest Common Ancestor of a Binary Tree
 * author: Ives.He 
 * date: 2021-10-24 13:54:27
 * for TEST copy:
 * import leetcode.editor.en.P236_LowestCommonAncestorOfABinaryTree .Solution;
 * P236_LowestCommonAncestorOfABinaryTree_Test
 */
public class P236_LowestCommonAncestorOfABinaryTree{
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 判斷左右樹的遞迴
        if(root == null) return null;
        if(root.val==p.val || root.val==q.val) return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        // 判斷回傳結果,皆為空表示為root,其中一個不為空,表示節點在該樹
        if(left!=null&&right!=null) return root;
        return left != null ? left : right;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}