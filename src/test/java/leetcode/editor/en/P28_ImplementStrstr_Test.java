package leetcode.editor.en;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import leetcode.editor.en.P28_ImplementStrstr.Solution;

public class P28_ImplementStrstr_Test {
    private Solution solution;
    @Before
    public void setup() {this.solution = new P28_ImplementStrstr().new Solution();}

    @Test
    public void testExample3(){
        String needle = "";
        String haystack = "";
        int output = solution.strStr(haystack,needle);
        Assert.assertEquals(0,output);
    }

//    @Test
//    public void testExample2(){
//        String needle = "bba";
//        String haystack = "aaaaa";
//        int output = solution.strStr(haystack,needle);
//        Assert.assertEquals(-1,output);
//    }

//    @Test
//    public void testExample1(){
//        String needle = "hello";
//        String haystack = "ll";
//        int output = solution.strStr(haystack,needle);
//        Assert.assertEquals(2,output);
//    }

//    @Test
//    public void testOneLength(){
//        String needle = "l";
//        String haystack = "l";
//        int output = solution.strStr(haystack,needle);
//        Assert.assertEquals(0,output);
//    }

//    @Test
//    public void testSameWord(){
//        String needle = "tmp";
//        String haystack = "tmp";
//        int output = solution.strStr(haystack,needle);
//        Assert.assertEquals(0,output);
//    }

}
