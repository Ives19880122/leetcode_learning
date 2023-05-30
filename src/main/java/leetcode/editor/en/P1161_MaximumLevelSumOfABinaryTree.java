//Given the root of a binary tree, the level of its root is 1, the level of its 
//children is 2, and so on. 
//
// Return the smallest level x such that the sum of all the values of nodes at 
//level x is maximal. 
//
// 
// Example 1: 
// 
// 
//Input: root = [1,7,0,7,-8,null,null]
//Output: 2
//Explanation: 
//Level 1 sum = 1.
//Level 2 sum = 7 + 0 = 7.
//Level 3 sum = 7 + -8 = -1.
//So we return the level with the maximum sum which is level 2.
// 
//
// Example 2: 
//
// 
//Input: root = [989,null,10250,98693,-89388,null,null,null,-32127]
//Output: 2
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [1, 10⁴]. 
// -10⁵ <= Node.val <= 10⁵ 
// 
//
// Related Topics Tree Depth-First Search Breadth-First Search Binary Tree 👍 19
//68 👎 70
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * id: 1161
 * title: Maximum Level Sum of a Binary Tree
 * author: Ives.He 
 * date: 2023-05-31 01:46:24
 * for TEST copy:
 * import leetcode.editor.en.P1161_MaximumLevelSumOfABinaryTree .Solution;
 * P1161_MaximumLevelSumOfABinaryTree_Test
 */
public class P1161_MaximumLevelSumOfABinaryTree{
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
    public int maxLevelSum(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root,0,list);
        int result = 0;
        for(int i = 1; i<list.size(); i++){
            if(list.get(result)<list.get(i)) result = i;
        }
        return result+1;
    }
    private void helper(TreeNode node, int level, List<Integer> list){
        if(node==null) return;
        if(list.size()==level) list.add(node.val);
        else list.set(level,list.get(level)+ node.val);
        helper(node.left,level+1,list);
        helper(node.right,level+1,list);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}