package leetcode.editor.en;

import leetcode.editor.en.P700_SearchInABinarySearchTree.Solution;
import leetcode.util.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P700_SearchInABinarySearchTree_Test {
    Solution solution;
    @Before
    public void setup(){
        this.solution = new P700_SearchInABinarySearchTree().new Solution();
    }
    boolean isSameTree(TreeNode l , TreeNode r){
        return new P100_SameTree().new Solution().isSameTree(l,r);
    }
    @Test
    public void ex1(){
        TreeNode input = new TreeNode(4,new TreeNode(2,new TreeNode(1),new TreeNode(3)),new TreeNode(7));
        TreeNode expect = new TreeNode(2,new TreeNode(1),new TreeNode(3));
        TreeNode output = solution.searchBST(input,2);
        Assert.assertTrue(isSameTree(expect,output));
    }
    @Test
    public void ex2(){
        TreeNode input = new TreeNode(4,new TreeNode(2,new TreeNode(1),new TreeNode(3)),new TreeNode(7));
        TreeNode output = solution.searchBST(input,5);
        Assert.assertTrue(isSameTree(null,output));
    }
    @Test
    public void tx1(){
        TreeNode input = new TreeNode(4);
        TreeNode output = solution.searchBST(input,5);
        Assert.assertTrue(isSameTree(null,output));
    }
    @Test
    public void tx2(){
        TreeNode input = new TreeNode(5);
        TreeNode output = solution.searchBST(input,5);
        Assert.assertTrue(isSameTree(input,output));
    }
}
