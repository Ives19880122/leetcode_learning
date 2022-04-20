//Given the root of a binary tree, return the average value of the nodes on 
//each level in the form of an array. Answers within 10⁻⁵ of the actual answer will 
//be accepted.
// 
// Example 1: 
//
// 
//Input: root = [3,9,20,null,null,15,7]
//Output: [3.00000,14.50000,11.00000]
//Explanation: The average value of nodes on level 0 is 3, on level 1 is 14.5, 
//and on level 2 is 11.
//Hence return [3, 14.5, 11].
// 
//
// Example 2: 
//
// 
//Input: root = [3,9,20,15,7]
//Output: [3.00000,14.50000,11.00000]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [1, 10⁴]. 
// -2³¹ <= Node.val <= 2³¹ - 1 
// 
// Related Topics Tree Depth-First Search Breadth-First Search Binary Tree 👍 29
//29 👎 231
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * id: 637
 * title: Average of Levels in Binary Tree
 * author: Ives.He 
 * date: 2022-04-21 00:19:57
 * for TEST copy:
 * import leetcode.editor.en.P637_AverageOfLevelsInBinaryTree .Solution;
 * P637_AverageOfLevelsInBinaryTree_Test
 */
public class P637_AverageOfLevelsInBinaryTree{
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
    List<List<Integer>> data = new ArrayList<>();
    public List<Double> averageOfLevels(TreeNode root) {
        helper(root,0);
        return data.stream().map(list->list.stream().mapToDouble(Integer::longValue).average().getAsDouble())
                .collect(Collectors.toList());
    }
    void helper(TreeNode node, int level){
        if(node==null)return;
        if(level == data.size()) data.add(new ArrayList<>());
        data.get(level).add(node.val);
        helper(node.left,level+1);
        helper(node.right,level+1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}