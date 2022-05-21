//You have a RecentCounter class which counts the number of recent requests 
//within a certain time frame. 
//
// Implement the RecentCounter class: 
//
// 
// RecentCounter() Initializes the counter with zero recent requests. 
// int ping(int t) Adds a new request at time t, where t represents some time 
//in milliseconds, and returns the number of requests that has happened in the past 
//3000 milliseconds (including the new request). Specifically, return the number 
//of requests that have happened in the inclusive range [t - 3000, t]. 
// 
//
// It is guaranteed that every call to ping uses a strictly larger value of t 
//than the previous call. 
//
// 
// Example 1: 
//
// 
//Input
//["RecentCounter", "ping", "ping", "ping", "ping"]
//[[], [1], [100], [3001], [3002]]
//Output
//[null, 1, 2, 3, 3]
//
//Explanation
//RecentCounter recentCounter = new RecentCounter();
//recentCounter.ping(1);     // requests = [1], range is [-2999,1], return 1
//recentCounter.ping(100);   // requests = [1, 100], range is [-2900,100], 
//return 2
//recentCounter.ping(3001);  // requests = [1, 100, 3001], range is [1,3001], 
//return 3
//recentCounter.ping(3002);  // requests = [1, 100, 3001, 3002], range is [2,300
//2], return 3
// 
//
// 
// Constraints: 
//
// 
// 1 <= t <= 10⁹ 
// Each test case will call ping with strictly increasing values of t. 
// At most 10⁴ calls will be made to ping. 
// 
// Related Topics Design Queue Data Stream 👍 749 👎 2446
    
package leetcode.editor.en;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * id: 933
 * title: Number of Recent Calls
 * author: Ives.He 
 * date: 2022-05-21 09:08:48
 * for TEST copy:
 * import leetcode.editor.en.P933_NumberOfRecentCalls .Solution;
 * P933_NumberOfRecentCalls_Test
 */
public class P933_NumberOfRecentCalls{
    //leetcode submit region begin(Prohibit modification and deletion)
class RecentCounter {
    Queue<Integer> history;

    public RecentCounter() {
      this.history = new LinkedList<>();
    }
    
    public int ping(int t) {
        int left = t - 3000;
        history.offer(t);
        int top = history.peek();
        while(top<left){
            history.poll();
            top = history.peek();
        }
        return history.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
//leetcode submit region end(Prohibit modification and deletion)

}