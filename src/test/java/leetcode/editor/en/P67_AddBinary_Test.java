package leetcode.editor.en;

import leetcode.editor.en.P67_AddBinary.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P67_AddBinary_Test {
    Solution solution;
    @Before
    public void setup(){
        solution = new P67_AddBinary().new Solution();
    }

    @Test
    public void example1(){
        String a = "11";
        String b = "1";
        String o = "100";
        Assert.assertEquals(o, solution.addBinary(a,b));
    }

    @Test
    public void example2(){
        String a = "1010";
        String b = "1011";
        String o = "10101";
        Assert.assertEquals(o, solution.addBinary(a,b));
    }
}
