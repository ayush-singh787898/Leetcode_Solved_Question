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
    public ListNode partition(ListNode head, int x) {
        ListNode ll = new ListNode(-1);
        ListNode node=ll;
        ListNode tp=head;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                node.next=new ListNode(temp.val);
                node=node.next;
            }
            temp=temp.next;
        }
        while(tp!=null){
            if(tp.val>=x){
                node.next=new ListNode(tp.val); 
                node=node.next;
            System.out.print(node.val+" ");
            }
            tp=tp.next;
        }
        return ll.next;
    }
}