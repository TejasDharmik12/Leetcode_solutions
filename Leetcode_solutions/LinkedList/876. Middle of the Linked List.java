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
    public ListNode middleNode(ListNode head) {
        //hare turtle method
        ListNode hare = head;
        ListNode turtle = head;
         
        while(hare!=null && hare.next!=null){
            turtle = turtle.next;
            hare = hare.next.next;
        }
        return turtle;
    }
}
