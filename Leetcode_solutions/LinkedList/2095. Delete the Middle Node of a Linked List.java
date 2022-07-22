/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
    ListNode hare = head;
        ListNode turtle = head;
        if(head.next==null){
            return null;
        }
        // while(hare.next.next == null){
        //     turtle = turtle.next;
        //     hare= hare.next.next;
        // }
        int size = 0;
        ListNode curr = head;
        while(curr != null){
            curr=curr.next;
            size++;
        }
       if(size==2){
           head.next =null;
       }else{
        while(hare!=null && hare.next !=null ){
            turtle = turtle.next;
            hare= hare.next.next;
        }
        turtle.val = turtle.next.val;
        turtle.next = turtle.next.next;}
        return head;
    }
}
