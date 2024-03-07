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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            ListNode x=temp;
            ListNode y=temp.next;
            int tempVal=y.val;
            y.val=x.val;
            x.val=tempVal;
            // System.out.println("x "+x.val+" y "+y.val);
            temp=y.next;
        }
        return head;
    }
}