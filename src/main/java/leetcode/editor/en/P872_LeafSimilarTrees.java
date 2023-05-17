//Consider all the leaves of a binary tree, from left to right order, the 
//values of those leaves form a leaf value sequence. 
//
// 
//
// For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9,
// 8). 
//
// Two binary trees are considered leaf-similar if their leaf value sequence is 
//the same. 
//
// Return true if and only if the two given trees with head nodes root1 and 
//root2 are leaf-similar. 
//
// 
// Example 1: 
// 
// 
//Input: root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,
//null,null,null,null,null,9,8]
//Output: true
// 
//
// Example 2: 
// 
// 
//Input: root1 = [1,2,3], root2 = [1,3,2]
//Output: false
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in each tree will be in the range [1, 200]. 
// Both of the given trees will have values in the range [0, 200]. 
// 
//
// Related Topics Tree Depth-First Search Binary Tree 👍 2995 👎 68
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * id: 872
 * title: Leaf-Similar Trees
 * author: Ives.He 
 * date: 2023-05-17 23:08:11
 * for TEST copy:
 * import leetcode.editor.en.P872_LeafSimilarTrees .Solution;
 * P872_LeafSimilarTrees_Test
 */
public class P872_LeafSimilarTrees{
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        dfs(root1,list1);
        dfs(root2,list2);
        if(list1.size()!=list2.size()) return false;
        for(int i =0; i<list1.size(); i++){
            if(!list1.get(i).equals(list2.get(i))) return false;
        }
        return true;
    }
    private void dfs(TreeNode node, List<Integer> list){
        if(node==null) return;
        if(node.left==null && node.right==null){
            list.add(node.val);
            return;
        }
        dfs(node.left,list);
        dfs(node.right,list);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}