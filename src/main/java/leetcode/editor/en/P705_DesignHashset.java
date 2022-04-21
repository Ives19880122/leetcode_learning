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

import java.util.Hashtable;
import java.util.LinkedList;

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
    private int[] arr;
    public MyHashSet() {
        arr = new int[0];
    }
    private void rehash(int key){
        int len = arr.length + key;
        int[] tmp = new int[len];
        int idx = 0;
        for(int num : arr){
            if(num!=-1){
                tmp[idx] = num;
                idx++;
            }
        }
        arr = tmp;
    }
    public void add(int key) {
        if(!contains(key)) {
            rehash(1);
            arr[arr.length-1] = key;
        }
    }
    
    public void remove(int key) {
        int idx = search(key);
        if(idx!=-1){
            arr[idx] = -1;
            rehash(-1);
        }
    }

    private int search(int key){
        for(int i = 0; i< arr.length; i++){
            if(arr[i]==key)return i;
        }
        return -1;
    }

    public boolean contains(int key) {
        return search(key)!=-1;
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