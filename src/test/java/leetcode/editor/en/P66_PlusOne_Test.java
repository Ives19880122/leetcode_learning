package leetcode.editor.en;

import leetcode.editor.en.P66_PlusOne.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P66_PlusOne_Test {
    Solution solution;

    @Before
    public void setup(){
        solution = new P66_PlusOne().new Solution();
    }

    @Test
    public void example1(){
        int [] i = {1,2,3};
        int [] o = {1,2,4};
        Assert.assertArrayEquals(o, solution.plusOne(i));
    }

    @Test
    public void example2(){
        int [] i = {4,3,2,1};
        int [] o = {4,3,2,2};
        Assert.assertArrayEquals(o, solution.plusOne(i));
    }

    @Test
    public void example3(){
        int [] i = {0};
        int [] o = {1};
        Assert.assertArrayEquals(o, solution.plusOne(i));
    }

    @Test
    public void example4(){
        int [] i = {9};
        int [] o = {1,0};
        Assert.assertArrayEquals(o, solution.plusOne(i));
    }
}
