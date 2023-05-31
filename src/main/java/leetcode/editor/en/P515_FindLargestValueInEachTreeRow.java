//Given the root of a binary tree, return an array of the largest value in each 
//row of the tree (0-indexed). 
//
// 
// Example 1: 
// 
// 
//Input: root = [1,3,2,5,3,null,9]
//Output: [1,3,9]
// 
//
// Example 2: 
//
// 
//Input: root = [1,2,3]
//Output: [1,3]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree will be in the range [0, 10⁴]. 
// -2³¹ <= Node.val <= 2³¹ - 1 
// 
//
// Related Topics Tree Depth-First Search Breadth-First Search Binary Tree 👍 26
//74 👎 95
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * id: 515
 * title: Find Largest Value in Each Tree Row
 * author: Ives.He 
 * date: 2023-06-01 00:49:21
 * for TEST copy:
 * import leetcode.editor.en.P515_FindLargestValueInEachTreeRow .Solution;
 * P515_FindLargestValueInEachTreeRow_Test
 */
public class P515_FindLargestValueInEachTreeRow{
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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> keeper = new ArrayList<>();
        helper(root,0,keeper);
        return keeper;
    }
    private void helper(TreeNode node, int level, List<Integer> keeper){
        if(node==null) return;
        if(keeper.size()==level) keeper.add(node.val);
        else keeper.set(level,Math.max(node.val,keeper.get(level)));
        helper(node.left,level+1,keeper);
        helper(node.right,level+1,keeper);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}