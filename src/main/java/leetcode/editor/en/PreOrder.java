package leetcode.editor.en;

/**
 * center -> left -> right
 */
public class PreOrder implements Traversal {
    @Override
    public String serialize(TreeNode root){
        if(root == null) return "#";
        return String.join(",",
                String.valueOf(root.val),
                serialize(root.left),
                serialize(root.right));
    }
    @Override
    public TreeNode deSerialize(String data){
        return new TreeNode(1);
    }
}
