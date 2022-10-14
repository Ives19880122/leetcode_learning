package leetcode.editor.en;
import leetcode.editor.en.P338_CountingBits.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P338_CountingBits_Test {
    private Solution solution;

    @Before
    public void setup(){
        this.solution = new P338_CountingBits().new Solution();
    }

    @Test
    public void test0(){
        int[] r = solution.countBits(2);
        Assert.assertArrayEquals(new int[]{0,1,1},r);
    }

    @Test
    public void test1(){
        int[] r = solution.countBits(5);
        Assert.assertArrayEquals(new int[]{0,1,1,2,1,2},r);
    }

    @Test
    public void test2(){
        int[] r = solution.countBits(6);
        Assert.assertArrayEquals(new int[]{0,1,1,2,1,2,2},r);
    }

    @Test
    public void test3(){
        int[] r = solution.countBits(7);
        Assert.assertArrayEquals(new int[]{0,1,1,2,1,2,2,3},r);
    }
}
