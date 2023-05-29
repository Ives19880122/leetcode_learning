//There are n rooms labeled from 0 to n - 1 and all the rooms are locked except 
//for room 0. Your goal is to visit all the rooms. However, you cannot enter a 
//locked room without having its key. 
//
// When you visit a room, you may find a set of distinct keys in it. Each key 
//has a number on it, denoting which room it unlocks, and you can take all of them 
//with you to unlock the other rooms. 
//
// Given an array rooms where rooms[i] is the set of keys that you can obtain 
//if you visited room i, return true if you can visit all the rooms, or false 
//otherwise. 
//
// 
// Example 1: 
//
// 
//Input: rooms = [[1],[2],[3],[]]
//Output: true
//Explanation: 
//We visit room 0 and pick up key 1.
//We then visit room 1 and pick up key 2.
//We then visit room 2 and pick up key 3.
//We then visit room 3.
//Since we were able to visit every room, we return true.
// 
//
// Example 2: 
//
// 
//Input: rooms = [[1,3],[3,0,1],[2],[0]]
//Output: false
//Explanation: We can not enter room number 2 since the only key that unlocks 
//it is in that room.
// 
//
// 
// Constraints: 
//
// 
// n == rooms.length 
// 2 <= n <= 1000 
// 0 <= rooms[i].length <= 1000 
// 1 <= sum(rooms[i].length) <= 3000 
// 0 <= rooms[i][j] < n 
// All the values of rooms[i] are unique. 
// 
//
// Related Topics Depth-First Search Breadth-First Search Graph 👍 5294 👎 239
    
package leetcode.editor.en;

import java.util.*;

/**
 * id: 841
 * title: Keys and Rooms
 * author: Ives.He 
 * date: 2023-05-29 23:55:12
 * for TEST copy:
 * import leetcode.editor.en.P841_KeysAndRooms .Solution;
 * P841_KeysAndRooms_Test
 */
public class P841_KeysAndRooms{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> keys = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        visited.add(0);
        // room 0
        for(Integer key : rooms.get(0)){
            keys.offer(key);
        }
        // no need key
        for(int i = 1; i<rooms.size(); i++){
            if(rooms.get(i).isEmpty()) visited.add(i);
        }
        // use key
        while(!keys.isEmpty()){
            int idx = keys.poll();
            if(!visited.add(idx)) continue;
            for(Integer key : rooms.get(idx)){
                keys.offer(key);
            }
        }
        return visited.size() == rooms.size();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}