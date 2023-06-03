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
import java.util.List;

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
        List<Integer> list = new ArrayList<>();
        dfs(root1,list);
        int l = list.size();
        dfs(root2,list);
        int r = list.size();
        mergeSort(list,l,r);
        return list;
    }
    private void dfs(TreeNode node, List<Integer> list){
        if(node==null) return;
        dfs(node.left,list);
        list.add(node.val);
        dfs(node.right,list);
    }
    private void mergeSort(List<Integer>list,int l, int r){
        List<Integer> keep = new ArrayList<>();
        int i = 0; int j =l;
        while(i<l&&j<r){
            if(list.get(i)<=list.get(j)){
                keep.add(list.get(i++));
            }else{
                keep.add(list.get(j++));
            }
        }
        while (i < l) {
            keep.add(list.get(i++));
        }
        while (j < r) {
            keep.add(list.get(j++));
        }
        list.clear();
        list.addAll(keep);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}