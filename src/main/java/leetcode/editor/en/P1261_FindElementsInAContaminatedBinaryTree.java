//Given a binary tree with the following rules: 
//
// 
// root.val == 0 
// If treeNode.val == x and treeNode.left != null, then treeNode.left.val == 2 *
// x + 1 
// If treeNode.val == x and treeNode.right != null, then treeNode.right.val == 2
// * x + 2 
// 
//
// Now the binary tree is contaminated, which means all treeNode.val have been 
//changed to -1. 
//
// Implement the FindElements class: 
//
// 
// FindElements(TreeNode* root) Initializes the object with a contaminated 
//binary tree and recovers it. 
// bool find(int target) Returns true if the target value exists in the 
//recovered binary tree. 
// 
//
// 
// Example 1: 
// 
// 
//Input
//["FindElements","find","find"]
//[[[-1,null,-1]],[1],[2]]
//Output
//[null,false,true]
//Explanation
//FindElements findElements = new FindElements([-1,null,-1]); 
//findElements.find(1); // return False 
//findElements.find(2); // return True 
//
// Example 2: 
// 
// 
//Input
//["FindElements","find","find","find"]
//[[[-1,-1,-1,-1,-1]],[1],[3],[5]]
//Output
//[null,true,true,false]
//Explanation
//FindElements findElements = new FindElements([-1,-1,-1,-1,-1]);
//findElements.find(1); // return True
//findElements.find(3); // return True
//findElements.find(5); // return False 
//
// Example 3: 
// 
// 
//Input
//["FindElements","find","find","find","find"]
//[[[-1,null,-1,-1,null,-1]],[2],[3],[4],[5]]
//Output
//[null,true,false,false,true]
//Explanation
//FindElements findElements = new FindElements([-1,null,-1,-1,null,-1]);
//findElements.find(2); // return True
//findElements.find(3); // return False
//findElements.find(4); // return False
//findElements.find(5); // return True
// 
//
// 
// Constraints: 
//
// 
// TreeNode.val == -1 
// The height of the binary tree is less than or equal to 20 
// The total number of nodes is between [1, 10⁴] 
// Total calls of find() is between [1, 10⁴] 
// 0 <= target <= 10⁶ 
// 
//
// Related Topics Hash Table Tree Depth-First Search Breadth-First Search 
//Design Binary Tree 👍 882 👎 92
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

import java.util.HashSet;

/**
 * id: 1261
 * title: Find Elements in a Contaminated Binary Tree
 * author: Ives.He 
 * date: 2023-06-03 14:58:04
 * for TEST copy:
 * import leetcode.editor.en.P1261_FindElementsInAContaminatedBinaryTree .Solution;
 * P1261_FindElementsInAContaminatedBinaryTree_Test
 */
public class P1261_FindElementsInAContaminatedBinaryTree{
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
class FindElements {

    private final HashSet<Integer> note;

    public FindElements(TreeNode root) {
        this.note = new HashSet<>();
        recover(root,0);
    }

    private void recover(TreeNode node,int p){
        if(node!=null){
            this.note.add(p);
        }else{
            return;
        }
        recover(node.left,p*2+1);
        recover(node.right,p*2+2);
    }

    public boolean find(int target) {
        return this.note.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
//leetcode submit region end(Prohibit modification and deletion)

}