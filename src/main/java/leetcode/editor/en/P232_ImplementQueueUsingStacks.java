//Implement a first in first out (FIFO) queue using only two stacks. The 
//implemented queue should support all the functions of a normal queue (push, peek, pop, 
//and empty). 
//
// Implement the MyQueue class: 
//
// 
// void push(int x) Pushes element x to the back of the queue. 
// int pop() Removes the element from the front of the queue and returns it. 
// int peek() Returns the element at the front of the queue. 
// boolean empty() Returns true if the queue is empty, false otherwise. 
// 
//
// Notes: 
//
// 
// You must use only standard operations of a stack, which means only push to 
//top, peek/pop from top, size, and is empty operations are valid. 
// Depending on your language, the stack may not be supported natively. You may 
//simulate a stack using a list or deque (double-ended queue) as long as you use 
//only a stack's standard operations. 
// 
//
// 
// Example 1: 
//
// 
//Input
//["MyQueue", "push", "push", "peek", "pop", "empty"]
//[[], [1], [2], [], [], []]
//Output
//[null, null, null, 1, 1, false]
//
//Explanation
//MyQueue myQueue = new MyQueue();
//myQueue.push(1); // queue is: [1]
//myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
//myQueue.peek(); // return 1
//myQueue.pop(); // return 1, queue is [2]
//myQueue.empty(); // return false
// 
//
// 
// Constraints: 
//
// 
// 1 <= x <= 9 
// At most 100 calls will be made to push, pop, peek, and empty. 
// All the calls to pop and peek are valid. 
// 
//
// 
// Follow-up: Can you implement the queue such that each operation is amortized 
//O(1) time complexity? In other words, performing n operations will take overall 
//O(n) time even if one of those operations may take longer. 
// Related Topics Stack Design Queue 👍 3178 👎 217
    
package leetcode.editor.en;

import java.util.Stack;

/**
 * id: 232
 * title: Implement Queue using Stacks
 * author: Ives.He 
 * date: 2022-04-10 00:26:19
 * for TEST copy:
 * import leetcode.editor.en.P232_ImplementQueueUsingStacks .Solution;
 * P232_ImplementQueueUsingStacks_Test
 */
public class P232_ImplementQueueUsingStacks{
    //leetcode submit region begin(Prohibit modification and deletion)
class MyQueue {
    private final Stack<Integer> stack;

    public MyQueue() {
        stack = new Stack<>();
    }
    
    public void push(int x) {
        stack.add(stack.size(),x);
    }
    
    public int pop() {
        int val = stack.get(0);
        stack.remove(0);
        return val;
    }
    
    public int peek() {
        return stack.get(0);
    }
    
    public boolean empty() {
        return stack.size()==0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
//leetcode submit region end(Prohibit modification and deletion)

}