package leetcode.editor.en;

import leetcode.editor.en.P70_ClimbingStairs.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P70_ClimbingStairs_Test {
    Solution solution;

    @Before
    public void setup(){
        solution = new P70_ClimbingStairs().new Solution();
    }

    @Test
    public void ex1(){
        int i = 2;
        int o = 2;
        Assert.assertEquals(o,solution.climbStairs(i));
    }
    @Test
    public void ex2(){
        int i = 3;
        int o = 3;
        Assert.assertEquals(o,solution.climbStairs(i));
    }
    @Test
    public void bd1(){
        int i = 1;
        int o = 1;
        Assert.assertEquals(o,solution.climbStairs(i));
    }
    @Test
    public void tx1(){
        int i = 10;
        int o = 89;
        Assert.assertEquals(o,solution.climbStairs(i));
    }
    @Test
    public void tx2(){
        int i = 40;
        int o = 165580141;
        Assert.assertEquals(o,solution.climbStairs(i));
    }
    @Test
    public void tx3(){
        int i = 44;
        int o = 1134903170;
        Assert.assertEquals(o,solution.climbStairs(i));
    }

    @Test
    public void tx4(){
        int i = 43;
        int o = 701408733;
        Assert.assertEquals(o,solution.climbStairs(i));
    }

    @Test
    public void tx5(){
        int i = 45;
        int o = 1134903170 + 701408733;
        Assert.assertEquals(o,solution.climbStairs(i));
    }
}
