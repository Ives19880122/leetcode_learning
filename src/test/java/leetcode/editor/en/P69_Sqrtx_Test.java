package leetcode.editor.en;

import leetcode.editor.en.P69_Sqrtx.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P69_Sqrtx_Test {
    Solution solution;

    @Before
    public void setup(){
        solution = new P69_Sqrtx().new Solution();
    }

    @Test
    public void example1(){
        int i = 4;
        int o = 2;
        Assert.assertEquals(o,solution.mySqrt(i));
    }

    @Test
    public void example2(){
        int i = 8;
        int o = 2;
        Assert.assertEquals(o,solution.mySqrt(i));
    }

    @Test
    public void test1(){
        int i = 0;
        int o = 0;
        Assert.assertEquals(o,solution.mySqrt(i));
    }

    @Test
    public void test2(){
        int i = 2147483647;
        int o = (int)Math.pow(i,0.5);
        Assert.assertEquals(o,solution.mySqrt(i));
    }

    @Test
    public void test3(){
        int i = 1;
        int o = 1;
        Assert.assertEquals(o,solution.mySqrt(i));
    }
}
