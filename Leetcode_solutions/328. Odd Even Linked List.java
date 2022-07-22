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
    public ListNode oddEvenList(ListNode head) {
//         ListNode odd = new ListNode(0);
//         ListNode even = new ListNode(0);
        
//         ListNode oddTail = odd;
//         ListNode evenTail = even;
        
//         int pos = 1;
//         while(head!=null){
//             if(pos %2 != 0){
//                 oddTail.next = head;
//                 oddTail = oddTail.next;
//             }
//             else{
//                 evenTail.next = head;
//                 evenTail = evenTail.next;
//             }
//             pos++;
//         }
//            oddTail.next = even.next;
//         evenTail.next =null;
        
//         return odd.next;

        //O(1) Space complexity
        if(head == null){
            return head;
        }
        ListNode odd= head;
        ListNode even = head.next;
        
        ListNode evenHead = even;
        
        while(even != null && even.next!=null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
        
        
    }
}
