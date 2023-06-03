//Given two binary search trees root1 and root2, return a list containing all 
//the integers from both trees sorted in ascending order. 
//
// 
// Example 1: 
// 
// 
//Input: root1 = [2,1,4], root2 = [1,0,3]
//Output: [0,1,1,2,3,4]
// 
//
// Example 2: 
// 
// 
//Input: root1 = [1,null,8], root2 = [8,1]
//Output: [1,1,8,8]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in each tree is in the range [0, 5000]. 
// -10⁵ <= Node.val <= 10⁵ 
// 
//
// Related Topics Tree Depth-First Search Binary Search Tree Sorting Binary 
//Tree 👍 2795 👎 82
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * id: 1305
 * title: All Elements in Two Binary Search Trees
 * author: Ives.He 
 * date: 2023-06-03 10:10:37
 * for TEST copy:
 * import leetcode.editor.en.P1305_AllElementsInTwoBinarySearchTrees .Solution;
 * P1305_AllElementsInTwoBinarySearchTrees_Test
 */
public class P1305_AllElementsInTwoBinarySearchTrees{
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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        Queue<Integer> ref = new LinkedList<>();
        dfs(root1,ref);
        List<Integer> list = new ArrayList<>();
        dfs(root2,list,ref);
        list.addAll(ref);
        return list;
    }

    /**
     * 使用Queue裝載inorder traversal的排序資料
     */
    private void dfs(TreeNode node, Queue<Integer> ref){
        if(node==null) return;
        dfs(node.left,ref);
        ref.offer(node.val);
        dfs(node.right,ref);
    }

    /**
     * 透過ref取得前一個樹的排序資料,同時inorder traversal+merge
     */
    private void dfs(TreeNode node, List<Integer> list, Queue<Integer> ref){
        if(node==null) return;
        dfs(node.left,list,ref);
        while(!ref.isEmpty() && ref.peek()<=node.val) list.add(ref.poll());
        list.add(node.val);
        dfs(node.right,list,ref);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}