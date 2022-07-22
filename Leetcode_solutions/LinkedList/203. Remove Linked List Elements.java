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
    public ListNode removeElements(ListNode head, int val) {
//         if(head == null){
//             return null;
//         }
//         ListNode dummy = new ListNode(0);
        
//         ListNode prev = dummy;
//         prev.next = head;
//         ListNode curr = head;
//         if(curr.next==null){
//             if(curr.val==val){}
//                 prev.next = null;
//                 }
//         while(curr!=null && curr.next != null){
//             if(curr.val==val){
//                curr.val = curr.next.val;
//                prev.next = curr.next;
//             }
//             curr = curr.next;
//         }
//         return head;
//         }
            ListNode curr =head;
         ListNode prev=null;
     while(curr!=null && curr.val == val){
         head = curr.next;
         curr = head;
     }     
        while(curr!=null){
            if(curr.val == val){
                prev.next = curr.next;
                curr = curr.next;
            }
            else{
                prev = curr;
                curr = curr.next;
            }
            
        }return head;
    }   
        
    }
