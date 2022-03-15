package leetcode.practice;

import leetcode.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * center -> left -> right
 */
public class PreOrder implements Traversal {
    @Override
    public String serialize(TreeNode root){
        if(root == null) return "#";
        return String.join(",", String.valueOf(root.val),serialize(root.left),serialize(root.right));
    }
    @Override
    public TreeNode deSerialize(String data){
        Queue<String> root = new LinkedList<>();
        String [] tmp = data.split(",");
        for(int i = 0; i< tmp.length; i++){
            root.add(tmp[i]);
        }
        return deSerialize(root);
    }
    TreeNode deSerialize(Queue<String> root){
        String r = root.poll();
        if("#".equals(r)) return null;
        return new TreeNode(Integer.valueOf(r),deSerialize(root),deSerialize(root));
    }
}
