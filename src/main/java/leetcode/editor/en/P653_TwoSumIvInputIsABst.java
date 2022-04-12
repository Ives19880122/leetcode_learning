//Given the root of a Binary Search Tree and a target number k, return true if 
//there exist two elements in the BST such that their sum is equal to the given 
//target. 
//
// 
// Example 1: 
//
// 
//Input: root = [5,3,6,2,4,null,7], k = 9
//Output: true
// 
//
// Example 2: 
//
// 
//Input: root = [5,3,6,2,4,null,7], k = 28
//Output: false
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [1, 10⁴]. 
// -10⁴ <= Node.val <= 10⁴ 
// root is guaranteed to be a valid binary search tree. 
// -10⁵ <= k <= 10⁵ 
// 
// Related Topics Hash Table Two Pointers Tree Depth-First Search Breadth-First 
//Search Binary Search Tree Binary Tree 👍 3517 👎 199
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

/**
 * id: 653
 * title: Two Sum IV - Input is a BST
 * author: Ives.He 
 * date: 2022-04-12 23:30:42
 * for TEST copy:
 * import leetcode.editor.en.P653_TwoSumIvInputIsABst .Solution;
 * P653_TwoSumIvInputIsABst_Test
 */
public class P653_TwoSumIvInputIsABst{
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
    private boolean valid = false;
    private int target;
    private TreeNode start;
    public boolean findTarget(TreeNode root, int k) {
        start = root;
        target = k;
        bts(root);
        return valid;
    }
    // 第一層Travel
    void bts(TreeNode node){
        if(node==null||valid) return;
        valid(start,node);
        bts(node.left);
        bts(node.right);
    }
    // 第二層Travel
    void valid(TreeNode root,TreeNode node){
        if(root==null||valid) return;
        // 避免相加同一個節點
        if(root!=node && root.val+node.val == target) valid = true;
        valid(root.left,node);
        valid(root.right,node);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}