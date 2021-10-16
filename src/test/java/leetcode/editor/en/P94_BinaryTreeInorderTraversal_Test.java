package leetcode.editor.en;

import leetcode.editor.en.P94_BinaryTreeInorderTraversal.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class P94_BinaryTreeInorderTraversal_Test {
    Solution solution;
    @Before
    public void setup(){
        this.solution = new P94_BinaryTreeInorderTraversal().new Solution();
    }

    @Test
    public void ex1(){
        Integer [] root = {1,null,2,3};
        TreeNode in = new TreeNode(root[0]);
        TreeNode tmp = in;
        tmp.left = null;
        tmp.right = new TreeNode(root[2]);
        tmp = tmp.right;
        tmp.left = new TreeNode(root[3]);
        Integer [] out = {1,3,2};
        List<Integer> res = solution.inorderTraversal(in);
        Assert.assertArrayEquals(out,res.toArray(new Integer[res.size()]));
    }
    @Test
    public void ex2(){
        Integer [] out = {};
        List<Integer> res = solution.inorderTraversal(null);
        Assert.assertArrayEquals(out,res.toArray(new Integer[res.size()]));
    }
    @Test
    public void ex3(){
        Integer [] out = {1};
        List<Integer> res = solution.inorderTraversal(new TreeNode(1));
        Assert.assertArrayEquals(out,res.toArray(new Integer[res.size()]));
    }
    @Test
    public void ex4(){
        Integer [] out = {2,1};
        List<Integer> res = solution.inorderTraversal(new TreeNode(1,new TreeNode(2),null));
        Assert.assertArrayEquals(out,res.toArray(new Integer[res.size()]));
    }
    @Test
    public void ex5(){
        Integer [] root = {1,null,2};
        Integer [] out = {1,2};
        List<Integer> res = solution.inorderTraversal(new TreeNode(1,null,new TreeNode(2)));
        Assert.assertArrayEquals(out,res.toArray(new Integer[res.size()]));
    }
    @Test
    public void tx1(){
        // 1,2,3,4,5,6,7,8
        TreeNode in = new TreeNode(1,
                new TreeNode(2,new TreeNode(4,new TreeNode(8),null), new TreeNode(5)),
                new TreeNode(3,new TreeNode(6), new TreeNode(7)));
        Integer [] out = {8,4,2,5,1,6,3,7};
        List<Integer> res = solution.inorderTraversal(in);
        Assert.assertArrayEquals(out,res.toArray(new Integer[res.size()]));
    }
    /**
     * Constraints
     * The number of nodes in the tree is in the range [0, 100].
     * -100 <= Node.val <= 100
     */
}
