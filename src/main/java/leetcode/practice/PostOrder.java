package leetcode.practice;

import leetcode.util.TreeNode;

import java.util.Stack;

/**
 * left -> right -> center
 */
public class PostOrder implements Traversal {
    @Override
    public String serialize(TreeNode root){
        if(root == null) return "#";
        return String.join(",", serialize(root.left),serialize(root.right),String.valueOf(root.val));
    }
    @Override
    public TreeNode deSerialize(String data){
        Stack<String> root = new Stack<>();
        String [] tmp = data.split(",");
        for(int i = 0; i< tmp.length; i++){
            root.push(tmp[i]);
        }
        return deSerialize(root);
    }
    TreeNode deSerialize(Stack<String> root){
        String r = root.pop();
        if("#".equals(r)) return null;
        // the last element is the root!!
        TreeNode t = new TreeNode(Integer.valueOf(r));
        t.right = deSerialize(root);
        t.left = deSerialize(root);
        return t;
    }
}
