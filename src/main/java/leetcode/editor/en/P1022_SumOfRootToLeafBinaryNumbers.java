//You are given the root of a binary tree where each node has a value 0 or 1. 
//Each root-to-leaf path represents a binary number starting with the most 
//significant bit. 
//
// 
// For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could represent 
//01101 in binary, which is 13. 
// 
//
// For all leaves in the tree, consider the numbers represented by the path 
//from the root to that leaf. Return the sum of these numbers. 
//
// The test cases are generated so that the answer fits in a 32-bits integer. 
//
// 
// Example 1: 
//
// 
//Input: root = [1,0,1,0,1,0,1]
//Output: 22
//Explanation: (100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
// 
//
// Example 2: 
//
// 
//Input: root = [0]
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [1, 1000]. 
// Node.val is 0 or 1. 
// 
// Related Topics Tree Depth-First Search Binary Tree 👍 2476 👎 149
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * id: 1022
 * title: Sum of Root To Leaf Binary Numbers
 * author: Ives.He 
 * date: 2022-04-17 13:51:50
 * for TEST copy:
 * import leetcode.editor.en.P1022_SumOfRootToLeafBinaryNumbers .Solution;
 * P1022_SumOfRootToLeafBinaryNumbers_Test
 */
public class P1022_SumOfRootToLeafBinaryNumbers{
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
    private final List<Integer> list = new ArrayList<>();
    public int sumRootToLeaf(TreeNode root) {
        // 0 表示都給正整數
        helper(root,"0");
        int result = 0;
        for(int num : list) result += num;
        return result;
    }
    // dfs preOrder Traversal, String紀錄走過的path
    void helper(TreeNode node, String path){
        if(node == null)return;
        helper(node.left,path+node.val);
        if(isLeaf(node)){
            list.add(Integer.valueOf(path + node.val,2));
        }
        helper(node.right,path+node.val);
    }
    // 判斷是否為leaf
    boolean isLeaf(TreeNode node){
        return node.left == null && node.right == null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}