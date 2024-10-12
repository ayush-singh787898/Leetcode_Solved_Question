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
        if(head!=null && head.next==null){
            return head;

        }
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int mid=size/2;
        temp=head;
        int inx=0;
        while(inx!=mid-1){
            temp=temp.next;
            inx++;
        }

        ListNode res=temp.next;
        temp.next=null;
        head=res;
        return head;
    }
}