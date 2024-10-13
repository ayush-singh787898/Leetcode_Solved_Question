/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;     // slow and head point to same value
        ListNode fast=head;     // fast and head point to same value
        ListNode start=null;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                start=head;
                while(start!=slow){
                    start=start.next;
                    slow=slow.next;
                }
                break;
            }
        }
        return start;
        
    }
}