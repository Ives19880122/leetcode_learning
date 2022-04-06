//Design your implementation of the linked list. You can choose to use a singly 
//or doubly linked list. 
//A node in a singly linked list should have two attributes: val and next. val 
//is the value of the current node, and next is a pointer/reference to the next 
//node. 
//If you want to use the doubly linked list, you will need one more attribute 
//prev to indicate the previous node in the linked list. Assume all nodes in the 
//linked list are 0-indexed. 
//
// Implement the MyLinkedList class: 
//
// 
// MyLinkedList() Initializes the MyLinkedList object. 
// int get(int index) Get the value of the indexᵗʰ node in the linked list. If 
//the index is invalid, return -1. 
// void addAtHead(int val) Add a node of value val before the first element of 
//the linked list. After the insertion, the new node will be the first node of the 
//linked list. 
// void addAtTail(int val) Append a node of value val as the last element of 
//the linked list. 
// void addAtIndex(int index, int val) Add a node of value val before the indexᵗ
//ʰ node in the linked list. If index equals the length of the linked list, the 
//node will be appended to the end of the linked list. If index is greater than the 
//length, the node will not be inserted. 
// void deleteAtIndex(int index) Delete the indexᵗʰ node in the linked list, if 
//the index is valid. 
// 
//
// 
// Example 1: 
//
// 
//Input
//["MyLinkedList", "addAtHead", "addAtTail", "addAtIndex", "get", 
//"deleteAtIndex", "get"]
//[[], [1], [3], [1, 2], [1], [1], [1]]
//Output
//[null, null, null, null, 2, null, 3]
//
//Explanation
//MyLinkedList myLinkedList = new MyLinkedList();
//myLinkedList.addAtHead(1);
//myLinkedList.addAtTail(3);
//myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
//myLinkedList.get(1);              // return 2
//myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
//myLinkedList.get(1);              // return 3
// 
//
// 
// Constraints: 
//
// 
// 0 <= index, val <= 1000 
// Please do not use the built-in LinkedList library. 
// At most 2000 calls will be made to get, addAtHead, addAtTail, addAtIndex and 
//deleteAtIndex. 
// 
// Related Topics Linked List Design 👍 1400 👎 1161
    
package leetcode.editor.en;

import leetcode.util.ListNode;

/**
 * id: 707
 * title: Design Linked List
 * author: Ives.He 
 * date: 2022-04-06 23:51:25
 * for TEST copy:
 * import leetcode.editor.en.P707_DesignLinkedList .Solution;
 * P707_DesignLinkedList_Test
 */
public class P707_DesignLinkedList{
    //leetcode submit region begin(Prohibit modification and deletion)
class MyLinkedList {
    public ListNode head;
    public ListNode tail;
    public int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public int get(int index) {
        if(index>=size){
            return tail.val;
        }
        ListNode tmp = head;
        while(index>0){
            tmp = tmp.next;
            index--;
        }
        return tmp.val;
    }
    
    public void addAtHead(int val) {
        ListNode tmp = new ListNode(val);
        if(this.head==null){
            this.head = this.tail = tmp;
        }else{
            tmp.next = this.head;
            this.head = tmp;
        }
        this.size++;
    }
    
    public void addAtTail(int val) {
        ListNode tmp = new ListNode(val);
        this.tail.next =tmp;
        this.tail = this.tail.next;
        this.size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index==0){
            addAtHead(val);
        }
        else if(index>=this.size){
            addAtTail(val);
        }else{
            ListNode tmp = this.head;
            while(index>1){
                tmp = tmp.next;
                index--;
            }
            ListNode bac = tmp.next;
            tmp.next = new ListNode(val);
            tmp.next.next = bac;
            this.size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index==0){
            head = head.next;
        }else{
            ListNode tmp = this.head;
            while(index>1){
                tmp = tmp.next;
                index--;
            }
            tmp.next = tmp.next.next;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
//leetcode submit region end(Prohibit modification and deletion)

}