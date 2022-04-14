//Given the root of a Binary Search Tree (BST), return the minimum difference 
//between the values of any two different nodes in the tree. 
//
// 
// Example 1: 
//
// 
//Input: root = [4,2,6,1,3]
//Output: 1
// 
//
// Example 2: 
//
// 
//Input: root = [1,0,48,null,null,12,49]
//Output: 1
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [2, 100]. 
// 0 <= Node.val <= 10⁵ 
// 
//
// 
// Note: This question is the same as 530: https://leetcode.com/problems/
//minimum-absolute-difference-in-bst/ 
// Related Topics Tree Depth-First Search Breadth-First Search Binary Search 
//Tree Binary Tree 👍 1585 👎 310
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * id: 783
 * title: Minimum Distance Between BST Nodes
 * author: Ives.He 
 * date: 2022-04-14 17:50:17
 * for TEST copy:
 * import leetcode.editor.en.P783_MinimumDistanceBetweenBstNodes .Solution;
 * P783_MinimumDistanceBetweenBstNodes_Test
 */
public class P783_MinimumDistanceBetweenBstNodes{
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
    private int min = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        help(root,list);
        for(int i=1; i<list.size();i++){
            min = Math.min(min,Math.abs(list.get(i)-list.get(i-1)));
        }
        return min;
    }
    /**
     * 使用inorder解
     */
    private void help(TreeNode node, List<Integer> list){
        if(node==null)return;
        help(node.left,list);
        list.add(node.val);
        help(node.right,list);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}