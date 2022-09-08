//Design a HashSet without using any built-in hash table libraries. 
//
// Implement MyHashSet class: 
//
// 
// void add(key) Inserts the value key into the HashSet. 
// bool contains(key) Returns whether the value key exists in the HashSet or 
//not. 
// void remove(key) Removes the value key in the HashSet. If key does not exist 
//in the HashSet, do nothing. 
// 
//
// 
// Example 1: 
//
// 
//Input
//["MyHashSet", "add", "add", "contains", "contains", "add", "contains", 
//"remove", "contains"]
//[[], [1], [2], [1], [3], [2], [2], [2], [2]]
//Output
//[null, null, null, true, false, null, true, null, false]
//
//Explanation
//MyHashSet myHashSet = new MyHashSet();
//myHashSet.add(1);      // set = [1]
//myHashSet.add(2);      // set = [1, 2]
//myHashSet.contains(1); // return True
//myHashSet.contains(3); // return False, (not found)
//myHashSet.add(2);      // set = [1, 2]
//myHashSet.contains(2); // return True
//myHashSet.remove(2);   // set = [1]
//myHashSet.contains(2); // return False, (already removed) 
//
// 
// Constraints: 
//
// 
// 0 <= key <= 10⁶ 
// At most 10⁴ calls will be made to add, remove, and contains. 
// 
// Related Topics Array Hash Table Linked List Design Hash Function 👍 1466 👎 1
//73

package leetcode.editor.en;

import leetcode.util.ListNode;

/**
  * id：705
  * title：Design HashSet
  * author: Ives.He
  * date：2022-04-21 13:14:06
  * for TEST copy:
  * import leetcode.editor.en.P705_DesignHashset .Solution;
  * P705_DesignHashset_Test
  */
public class P705_DesignHashset{
  
  //leetcode submit region begin(Prohibit modification and deletion)
class MyHashSet {
    private final ListNode[] buck;
    private final int buckSize;
    public MyHashSet() {
        buckSize = 20000;
        buck = new ListNode[buckSize];
    }

    public void add(int key) {
        ListNode tmp = buck[key%buckSize];
        if(tmp==null) {
            buck[key%buckSize] = new ListNode(key);
        }else{
                ListNode cur = tmp;
                ListNode prev = cur;
                while(cur!=null){
                    if(cur.val == key) return;
                    prev = cur;
                    cur = cur.next;
                }
                prev.next = new ListNode(key);
        }
    }
    
    public void remove(int key) {
        ListNode cur = buck[key%buckSize];
        while(cur!=null){
            if(cur.val == key) {
                cur.val = -1;
                return;
            }
            cur = cur.next;
        }
    }

    public boolean contains(int key) {
        ListNode cur = buck[key%buckSize];
        while(cur!=null){
            if(cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
//leetcode submit region end(Prohibit modification and deletion)


}