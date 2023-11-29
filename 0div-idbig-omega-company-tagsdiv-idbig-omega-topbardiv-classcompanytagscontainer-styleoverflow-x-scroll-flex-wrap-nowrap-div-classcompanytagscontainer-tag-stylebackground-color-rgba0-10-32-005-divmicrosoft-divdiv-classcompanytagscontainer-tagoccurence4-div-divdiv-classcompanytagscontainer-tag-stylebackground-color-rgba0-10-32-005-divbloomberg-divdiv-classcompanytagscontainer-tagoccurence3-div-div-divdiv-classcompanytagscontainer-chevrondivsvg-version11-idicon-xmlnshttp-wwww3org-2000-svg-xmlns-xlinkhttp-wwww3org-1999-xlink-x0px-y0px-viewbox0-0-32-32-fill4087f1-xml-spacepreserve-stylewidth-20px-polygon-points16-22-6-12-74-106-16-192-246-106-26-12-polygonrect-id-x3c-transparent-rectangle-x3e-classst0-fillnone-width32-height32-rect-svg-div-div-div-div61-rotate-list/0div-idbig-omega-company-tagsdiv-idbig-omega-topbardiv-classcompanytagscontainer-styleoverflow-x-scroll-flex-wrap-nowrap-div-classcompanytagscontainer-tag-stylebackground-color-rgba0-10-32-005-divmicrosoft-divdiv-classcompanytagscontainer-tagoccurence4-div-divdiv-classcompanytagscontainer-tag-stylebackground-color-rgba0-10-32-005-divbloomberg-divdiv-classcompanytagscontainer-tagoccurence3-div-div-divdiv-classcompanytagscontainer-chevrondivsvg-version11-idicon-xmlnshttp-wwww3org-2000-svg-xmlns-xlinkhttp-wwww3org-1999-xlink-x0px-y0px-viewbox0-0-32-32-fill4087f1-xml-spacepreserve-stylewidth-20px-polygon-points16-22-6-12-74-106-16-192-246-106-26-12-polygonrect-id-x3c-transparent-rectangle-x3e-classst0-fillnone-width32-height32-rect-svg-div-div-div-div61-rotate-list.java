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
    public ListNode rotateRight(ListNode head, int k) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(size==0){
            return head;
        }
        k=k%size;
        ListNode p1=head;
        ListNode p2=head;
        for(int i=0;i<k;i++){
            p2=p2.next;
        }
        while(p2.next!=null){
            p1=p1.next;
            p2=p2.next;
        }
        p2.next=head;
        ListNode newNode=p1.next;
        p1.next=null;
        return newNode;
    }
}