//Given the root of a binary tree, return the leftmost value in the last row of 
//the tree. 
//
// 
// Example 1: 
// 
// 
//Input: root = [2,1,3]
//Output: 1
// 
//
// Example 2: 
// 
// 
//Input: root = [1,2,3,4,null,5,6,null,null,7]
//Output: 7
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [1, 10⁴]. 
// -2³¹ <= Node.val <= 2³¹ - 1 
// 
//
// Related Topics Tree Depth-First Search Breadth-First Search Binary Tree 👍 29
//14 👎 242
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * id: 513
 * title: Find Bottom Left Tree Value
 * author: Ives.He 
 * date: 2023-05-31 01:32:25
 * for TEST copy:
 * import leetcode.editor.en.P513_FindBottomLeftTreeValue .Solution;
 * P513_FindBottomLeftTreeValue_Test
 */
public class P513_FindBottomLeftTreeValue{
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

    public int findBottomLeftValue(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root,0, list);
        return list.get(list.size()-1);
    }

    private void helper(TreeNode node, int level, List<Integer> list){
        if(node==null) return;
        if(list.size()==level){ // 每層最左代表level逐層搜尋第一個會碰到的元素
            list.add(node.val);
        }
        helper(node.left,level+1,list);
        helper(node.right,level+1,list);
    }


}
//leetcode submit region end(Prohibit modification and deletion)

}