package leetcode.editor.en;

import leetcode.editor.en.P83_RemoveDuplicatesFromSortedList.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P83_RemoveDuplicatesFromSortedList_Test {
    Solution solution;
    @Before
    public void setup(){
        solution = new P83_RemoveDuplicatesFromSortedList().new Solution();
    }

    public ListNode input(int[] n){
        ListNode head = new ListNode(0);
        ListNode tmp = head;
        int idx = 0;
        while(idx < n.length){
            tmp.next = new ListNode(n[idx]);
            tmp = tmp.next;
            idx++;
        }
        return head.next;
    }

    /**
     * 將題目結果輸出成陣列讓單元測試比對
     * @param n 輸入陣列
     * @param l 預期結果長度
     * @return
     */
    public int[] output(int[] n, int l){
        int[] tmp = n;
        // 將陣列輸入產生ListNode
        ListNode res = solution.deleteDuplicates(input(tmp));
        // 因應預期結果重設陣列大小
        tmp = new int[l];
        int idx = 0;
        while(res!=null){
            tmp[idx] = res.val;
            res = res.next;
            idx++;
        }
        return tmp;
    }
    /**
     * 測試輸入工具是否正確
     */
    @Test
    public void utilTest(){
        int[] t = new int[]{1,1,5};
        int[] o = new int[t.length];
        ListNode i = input(t);
        int idx = 0;
        while(i!=null){
            o[idx] = i.val;
            i=i.next;
            idx++;
        }
        Assert.assertArrayEquals(t,o);
    }

    @Test
    public void ex1(){
        int[] tmp = {1,1,2};
        int[] expect = {1,2};
        // 輸入輸出
        tmp = output(tmp,expect.length);
        // 結果比對
        Assert.assertArrayEquals(expect,tmp);
    }

    @Test
    public void ex2(){
        int[] tmp = {1,1,2,3,3};
        int[] expect = {1,2,3};
        // 輸入輸出
        tmp = output(tmp,expect.length);
        // 結果比對
        Assert.assertArrayEquals(expect,tmp);
    }

    /**
     * 陣列長度為0的狀況
     */
    @Test
    public void bd1(){
        int[] tmp = {};
        int[] expect = {};
        // 輸入輸出
        tmp = output(tmp,expect.length);
        // 結果比對
        Assert.assertArrayEquals(expect,tmp);
    }

    /**
     * 輸入陣列長度為300的狀況
     */
    @Test
    public void bd2(){
        int[] tmp = new int[300];
        int[] expect = {0};
        // 輸入輸出
        tmp = output(tmp,1);
        // 結果比對
        Assert.assertArrayEquals(expect,tmp);
    }

    /**
     * 0的狀況
     */
    @Test
    public void tx1(){
        int[] tmp = {0,0,0,0};
        int[] expect = {0};
        // 輸入輸出
        tmp = output(tmp,expect.length);
        // 結果比對
        Assert.assertArrayEquals(expect,tmp);
    }
}
