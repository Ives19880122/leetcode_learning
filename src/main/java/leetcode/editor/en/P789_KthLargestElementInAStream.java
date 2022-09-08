//Design a class to find the kᵗʰ largest element in a stream. Note that it is 
//the kᵗʰ largest element in the sorted order, not the kᵗʰ distinct element. 
//
// Implement KthLargest class: 
//
// 
// KthLargest(int k, int[] nums) Initializes the object with the integer k and 
//the stream of integers nums. 
// int add(int val) Appends the integer val to the stream and returns the 
//element representing the kᵗʰ largest element in the stream. 
// 
//
// 
// Example 1: 
//
// 
//Input
//["KthLargest", "add", "add", "add", "add", "add"]
//[[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
//Output
//[null, 4, 5, 5, 8, 8]
//
//Explanation
//KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);
//kthLargest.add(3);   // return 4
//kthLargest.add(5);   // return 5
//kthLargest.add(10);  // return 5
//kthLargest.add(9);   // return 8
//kthLargest.add(4);   // return 8
// 
//
// 
// Constraints: 
//
// 
// 1 <= k <= 10⁴ 
// 0 <= nums.length <= 10⁴ 
// -10⁴ <= nums[i] <= 10⁴ 
// -10⁴ <= val <= 10⁴ 
// At most 10⁴ calls will be made to add. 
// It is guaranteed that there will be at least k elements in the array when 
//you search for the kᵗʰ element. 
// 
// Related Topics Tree Design Binary Search Tree Heap (Priority Queue) Binary 
//Tree Data Stream 👍 1657 👎 987

package leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

/**
  * id：789
  * title：Kth Largest Element in a Stream
  * author: Ives.He
  * date：2021-11-01 12:34:18
  * for TEST copy:
  * import leetcode.editor.en.P789_KthLargestElementInAStream .Solution;
  * P789_KthLargestElementInAStream_Test
  */
public class P789_KthLargestElementInAStream{
  
  //leetcode submit region begin(Prohibit modification and deletion)
class KthLargest {
      int n;
      List<Integer> list;
      public KthLargest(int k, int[] nums) {
          this.n = k;
          this.list = new ArrayList<>();
          for(int val : nums){
              setQueue(val);
          }
      }

      public int add(int val) {
          setQueue(val);
          return peek();
      }

      void setQueue(int val){
          if(list.size()<n){
              offer(val);
          }else{
              if(peek()<val){
                  poll();
                  offer(val);
              }
          }
      }

      /**
       * 取得最上面一筆資料
       * @return
       */
      private Integer peek(){
          if(list.size()==0) return null;
          return list.get(0);
      }

      /**
       * 比較根節點與子節點大小
       * @param root
       * @param child
       * @return
       */
      private int compare(int root, int child){
          return root > child ? 1 : -1;
      }

      /**
       * 加入資料
       * @param val
       * @return
       */
      private boolean offer(int val){
          list.add(val);
          int child = list.size()-1;
          int parent = (child-1)/2;
          // Re heap 重新排列
          while(parent>=0 && compare(list.get(parent),list.get(child))>0){
              swap(parent,child);
              child = parent;
              parent = (child-1)/2;
          }
          return true;
      }

      /**
       * 取出資料
       * @return
       */
      private Integer poll(){
          if(list.size()==0)return null;
          int result = list.get(0);
          if(list.size()==1){
              list.remove(0);
              return result;
          }
          // 將最後一筆取到最前面進行重新排列
          list.set(0,list.remove(n-1));
          int parent = 0;
          while(true){
              int left = 2 * parent + 1;
              if(left>= list.size()) break;
              int right = left + 1;
              int min = left;
              if(right<list.size()&&compare(list.get(left),list.get(right))>0){
                  min = right;
              }
              // 與parent比較如果較小就要交換
              if(compare(list.get(parent),list.get(min))>0){
                  swap(parent,min);
                  parent = min;
              }else {
                  break;
              }
          }
          return result;
      }

      /**
       * 資料交換
       * @param parent
       * @param child
       */
      private void swap (int parent, int child){
          int tmp = list.get(parent);
          list.set(parent,list.get(child));
          list.set(child,tmp);
      }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
//leetcode submit region end(Prohibit modification and deletion)


}