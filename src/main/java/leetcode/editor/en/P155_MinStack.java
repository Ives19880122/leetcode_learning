//Design a stack that supports push, pop, top, and retrieving the minimum 
//element in constant time. 
//
// Implement the MinStack class: 
//
// 
// MinStack() initializes the stack object. 
// void push(int val) pushes the element val onto the stack. 
// void pop() removes the element on the top of the stack. 
// int top() gets the top element of the stack. 
// int getMin() retrieves the minimum element in the stack. 
// 
//
// 
// Example 1: 
//
// 
//Input
//["MinStack","push","push","push","getMin","pop","top","getMin"]
//[[],[-2],[0],[-3],[],[],[],[]]
//
//Output
//[null,null,null,null,-3,null,0,-2]
//
//Explanation
//MinStack minStack = new MinStack();
//minStack.push(-2);
//minStack.push(0);
//minStack.push(-3);
//minStack.getMin(); // return -3
//minStack.pop();
//minStack.top();    // return 0
//minStack.getMin(); // return -2
// 
//
// 
// Constraints: 
//
// 
// -2³¹ <= val <= 2³¹ - 1 
// Methods pop, top and getMin operations will always be called on non-empty 
//stacks. 
// At most 3 * 10⁴ calls will be made to push, pop, top, and getMin. 
// 
// Related Topics Stack Design 👍 7781 👎 608
    
package leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

/**
 * id: 155
 * title: Min Stack
 * author: Ives.He 
 * date: 2022-04-13 23:21:14
 * for TEST copy:
 * import leetcode.editor.en.P155_MinStack .Solution;
 * P155_MinStack_Test
 */
public class P155_MinStack{
    //leetcode submit region begin(Prohibit modification and deletion)
class MinStack {
    List<Integer> list;
    int min;
    int size;
    public MinStack() {
        list = new ArrayList<>();
        min = Integer.MAX_VALUE;
        size = 0;
    }
    
    public void push(int val) {
        list.add(size++,val);
        min = Math.min(min, val);
    }
    
    public void pop() {
        if(list.remove(--size)==min) swap();
    }
    
    public int top() {
        return list.get(size-1);
    }

    private void swap(){
        min = Integer.MAX_VALUE;
        // 簡化寫法比迭代器慢1ms
        for (int tmp : list) {
            min = Math.min(min, tmp);
        }
    }

    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
//leetcode submit region end(Prohibit modification and deletion)

}