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
    public int pairSum(ListNode head) {
        int sz=0;
        ListNode temp=head;
        int maxSum=Integer.MIN_VALUE;
        while(temp!=null){
            sz++;
            temp=temp.next;
        }

        ListNode slow=head;
        ListNode fast=head;
        int mid=sz/2;
        
        for(int i=0;i<mid;i++){
            fast=fast.next;
        }
        ListNode prev=null;
        while(fast!=null){
            ListNode next=fast.next;
            fast.next=prev;
            prev=fast;
            fast=next;
        }
        fast=prev;
        while(slow!=null && fast!=null){
            int sum=slow.val+fast.val;
            maxSum=Math.max(sum,maxSum);
            slow=slow.next;
            fast=fast.next;
        }
        return maxSum;
    }
}