package leetcode.editor.en;

import leetcode.editor.en.P1381_DesignAStackWithIncrementOperation.CustomStack;
import static org.junit.Assert.*;
import org.junit.Test;

public class P1381_DesignAStackWithIncrementOperation_Test {
    @Test
    public void example(){
        CustomStack customStack = new P1381_DesignAStackWithIncrementOperation().new CustomStack(3);
        assertArrayEquals(new int[3], customStack.arr);
        customStack.push(1);
        assertArrayEquals(new int[]{1,0,0},customStack.arr);
        customStack.push(2);
        assertArrayEquals(new int[]{1,2,0},customStack.arr);
        int res = customStack.pop();
        assertEquals(2,res);
        customStack.push(2);
        assertArrayEquals(new int[]{1,2,0},customStack.arr);
        customStack.push(3);
        assertArrayEquals(new int[]{1,2,3},customStack.arr);
        customStack.push(4);
        assertArrayEquals(new int[]{1,2,3},customStack.arr);
        customStack.increment(5, 100);
        assertArrayEquals(new int[]{101,102,103},customStack.arr);
        customStack.increment(2, 100);
        assertArrayEquals(new int[]{201,202,103},customStack.arr);
        int res1 = customStack.pop();
        assertEquals(103,res1);
        int res2 = customStack.pop();
        assertEquals(202,res2);
        int res3 = customStack.pop();
        assertEquals(201,res3);
        int res4 = customStack.pop();
        assertEquals(-1,res4);
    }
}
