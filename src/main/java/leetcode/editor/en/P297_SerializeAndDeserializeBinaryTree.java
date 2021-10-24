//Serialization is the process of converting a data structure or object into a 
//sequence of bits so that it can be stored in a file or memory buffer, or 
//transmitted across a network connection link to be reconstructed later in the same or 
//another computer environment. 
//
// Design an algorithm to serialize and deserialize a binary tree. There is no 
//restriction on how your serialization/deserialization algorithm should work. You 
//just need to ensure that a binary tree can be serialized to a string and this 
//string can be deserialized to the original tree structure. 
//
// Clarification: The input/output format is the same as how LeetCode 
//serializes a binary tree. You do not necessarily need to follow this format, so please be 
//creative and come up with different approaches yourself. 
//
// 
// Example 1: 
//
// 
//Input: root = [1,2,3,null,null,4,5]
//Output: [1,2,3,null,null,4,5]
// 
//
// Example 2: 
//
// 
//Input: root = []
//Output: []
// 
//
// Example 3: 
//
// 
//Input: root = [1]
//Output: [1]
// 
//
// Example 4: 
//
// 
//Input: root = [1,2]
//Output: [1,2]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 10⁴]. 
// -1000 <= Node.val <= 1000 
// 
// Related Topics String Tree Depth-First Search Breadth-First Search Design 
//Binary Tree 👍 5332 👎 224
    
package leetcode.editor.en;

import java.util.Set;

/**
 * id: 297
 * title: Serialize and Deserialize Binary Tree
 * author: Ives.He 
 * date: 2021-10-24 21:42:40
 * for TEST copy:
 * import leetcode.editor.en.P297_SerializeAndDeserializeBinaryTree .Solution;
 * P297_SerializeAndDeserializeBinaryTree_Test
 */
public class P297_SerializeAndDeserializeBinaryTree{
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    // null與分隔符號
    String sep =",";
    String emp ="#";
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuffer s = new StringBuffer();
        if(root!=null) {
            s.append(root.val);
            serialize(root.left,s);
            serialize(root.right,s);
        }else{
            s.append(emp);
        }
        return s.toString();
    }
    void serialize(TreeNode root,StringBuffer s){
        if(root!=null) {
            s.append(sep).append(root.val);
            serialize(root.left, s);
            serialize(root.right, s);
        }else{
            s.append(sep).append(emp);
        }
    }
    // 索引
    int i = 0;
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String [] r = data.split(",");
        return deserialize(r);
    }
    TreeNode deserialize(String[] r){
        String val = i< r.length ? r[i] : emp;
        i++;
        if(emp.equals(val)) return null;
        return new TreeNode(Integer.valueOf(val),
                deserialize(r),deserialize(r));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
//leetcode submit region end(Prohibit modification and deletion)

}