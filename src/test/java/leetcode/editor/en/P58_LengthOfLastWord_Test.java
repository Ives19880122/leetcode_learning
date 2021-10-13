package leetcode.editor.en;

import org.junit.Assert;
import org.junit.Before;
import leetcode.editor.en.P58_LengthOfLastWord.Solution;
import org.junit.Test;

public class P58_LengthOfLastWord_Test {
    Solution solution;

    @Before
    public void setup(){
        solution = new P58_LengthOfLastWord().new Solution();
    }

    @Test
    public void test1() {
        String input = "Hello world";
        int output = solution.lengthOfLastWord(input);
        Assert.assertEquals(5,output);
    }

    @Test
    public void test2() {
        String input = "   Hello world   ";
        int output = solution.lengthOfLastWord(input);
        Assert.assertEquals(5,output);
    }

    @Test
    public void test3() {
        String input = "Hello";
        int output = solution.lengthOfLastWord(input);
        Assert.assertEquals(5,output);
    }

    @Test
    public void test4() {
        String input = "  ";
        int output = solution.lengthOfLastWord(input);
        Assert.assertEquals(-1,output);
    }
}
