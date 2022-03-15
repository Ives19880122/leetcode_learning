package leetcode.editor.en;

import leetcode.editor.en.P106_ConstructBinaryTreeFromInorderAndPostorderTraversal.Solution;
import leetcode.util.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P106_ConstructBinaryTreeFromInorderAndPostorderTraversal_Test {
    Solution solution;

    @Before
    public void setup(){
        this.solution = new P106_ConstructBinaryTreeFromInorderAndPostorderTraversal().new Solution();
    }

    // 之前題目作為測試使用
    boolean isSameTree(TreeNode l , TreeNode r){
        return new P100_SameTree().new Solution().isSameTree(l,r);
    }

    @Test
    public void ex1(){
        TreeNode expect = new TreeNode(3, new TreeNode(9,null,null),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        TreeNode out = solution.buildTree(new int[] {9,3,15,20,7},new int[] {9,15,7,20,3});
        Assert.assertTrue(isSameTree(expect,out));
    }

    @Test
    public void ex2(){
        TreeNode expect = new TreeNode(-1);
        TreeNode out = solution.buildTree(new int[] {-1},new int[] {-1});
        Assert.assertTrue(isSameTree(expect,out));
    }
    @Test
    public void tx1(){
        TreeNode expect = new TreeNode(1,new TreeNode(2),null);
        TreeNode out = solution.buildTree(new int[] {2,1},new int[] {2,1});
        Assert.assertTrue(isSameTree(expect,out));
    }
    @Test
    public void tx2(){
        TreeNode expect = new TreeNode(1,null,new TreeNode(2));
        TreeNode out = solution.buildTree(new int[] {1,2},new int[] {2,1});
        Assert.assertTrue(isSameTree(expect,out));
    }
}
