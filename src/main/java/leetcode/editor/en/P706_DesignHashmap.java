//Design a HashMap without using any built-in hash table libraries. 
//
// Implement the MyHashMap class: 
//
// 
// MyHashMap() initializes the object with an empty map. 
// void put(int key, int value) inserts a (key, value) pair into the HashMap. 
//If the key already exists in the map, update the corresponding value. 
// int get(int key) returns the value to which the specified key is mapped, or -
//1 if this map contains no mapping for the key. 
// void remove(key) removes the key and its corresponding value if the map 
//contains the mapping for the key. 
// 
//
// 
// Example 1: 
//
// 
//Input
//["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]
//[[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]
//Output
//[null, null, null, 1, -1, null, 1, null, -1]
//
//Explanation
//MyHashMap myHashMap = new MyHashMap();
//myHashMap.put(1, 1); // The map is now [[1,1]]
//myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
//myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
//myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2
//,2]]
//myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the 
//existing value)
//myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
//myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
//myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]
// 
//
// 
// Constraints: 
//
// 
// 0 <= key, value <= 10⁶ 
// At most 10⁴ calls will be made to put, get, and remove. 
// 
// Related Topics Array Hash Table Linked List Design Hash Function 👍 2737 👎 2
//85

package leetcode.editor.en;
/**
  * id：706
  * title：Design HashMap
  * author: Ives.He
  * date：2022-04-22 12:34:41
  * for TEST copy:
  * import leetcode.editor.en.P706_DesignHashmap .Solution;
  * P706_DesignHashmap_Test
  */
public class P706_DesignHashmap{
  
  //leetcode submit region begin(Prohibit modification and deletion)
class MyHashMap {
    private Entry[] bucket;
    private int bucketSize;
    private Entry prev;
    public MyHashMap() {
        this.bucketSize = 10000;
        this.bucket = new Entry[this.bucketSize];
    }
    
    public void put(int key, int value) {
        int hash = key % this.bucketSize;
        Entry entry = this.bucket[hash];
        if(entry == null){
            this.bucket[hash] = new Entry(key,value);
            return;
        }
        entry = search(entry,key);
        if(entry==null){
            if(prev.key > key){
                prev.left = new Entry(key,value);
            }else{
                prev.right = new Entry(key,value);
            }
        }else{
            entry.value = value;
        }
    }
    
    public int get(int key) {
        int hash = key % this.bucketSize;
        Entry entry = this.bucket[hash];
        entry = search(entry,key);
        return entry != null ? entry.value : -1;
    }
    
    public void remove(int key) {
        int hash = key % this.bucketSize;
        Entry entry = this.bucket[hash];
        entry = search(entry,key);
        if(entry!=null){
            entry.value = -1;
        }
    }

    private Entry search(Entry node, int target){
        if(node == null) return null;
        // 遇到目標key回傳節點
        if(node.key==target) return node;
        prev = node;
        // 二元樹搜尋
        if(node.key>target){
            return search(node.left,target);
        }else{
            return search(node.right,target);
        }
    }

    private class Entry{
        int key;
        int value;
        public Entry(int key, int value){
            this.key = key;
            this.value = value;
        }
        Entry left;
        Entry right;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
//leetcode submit region end(Prohibit modification and deletion)


}