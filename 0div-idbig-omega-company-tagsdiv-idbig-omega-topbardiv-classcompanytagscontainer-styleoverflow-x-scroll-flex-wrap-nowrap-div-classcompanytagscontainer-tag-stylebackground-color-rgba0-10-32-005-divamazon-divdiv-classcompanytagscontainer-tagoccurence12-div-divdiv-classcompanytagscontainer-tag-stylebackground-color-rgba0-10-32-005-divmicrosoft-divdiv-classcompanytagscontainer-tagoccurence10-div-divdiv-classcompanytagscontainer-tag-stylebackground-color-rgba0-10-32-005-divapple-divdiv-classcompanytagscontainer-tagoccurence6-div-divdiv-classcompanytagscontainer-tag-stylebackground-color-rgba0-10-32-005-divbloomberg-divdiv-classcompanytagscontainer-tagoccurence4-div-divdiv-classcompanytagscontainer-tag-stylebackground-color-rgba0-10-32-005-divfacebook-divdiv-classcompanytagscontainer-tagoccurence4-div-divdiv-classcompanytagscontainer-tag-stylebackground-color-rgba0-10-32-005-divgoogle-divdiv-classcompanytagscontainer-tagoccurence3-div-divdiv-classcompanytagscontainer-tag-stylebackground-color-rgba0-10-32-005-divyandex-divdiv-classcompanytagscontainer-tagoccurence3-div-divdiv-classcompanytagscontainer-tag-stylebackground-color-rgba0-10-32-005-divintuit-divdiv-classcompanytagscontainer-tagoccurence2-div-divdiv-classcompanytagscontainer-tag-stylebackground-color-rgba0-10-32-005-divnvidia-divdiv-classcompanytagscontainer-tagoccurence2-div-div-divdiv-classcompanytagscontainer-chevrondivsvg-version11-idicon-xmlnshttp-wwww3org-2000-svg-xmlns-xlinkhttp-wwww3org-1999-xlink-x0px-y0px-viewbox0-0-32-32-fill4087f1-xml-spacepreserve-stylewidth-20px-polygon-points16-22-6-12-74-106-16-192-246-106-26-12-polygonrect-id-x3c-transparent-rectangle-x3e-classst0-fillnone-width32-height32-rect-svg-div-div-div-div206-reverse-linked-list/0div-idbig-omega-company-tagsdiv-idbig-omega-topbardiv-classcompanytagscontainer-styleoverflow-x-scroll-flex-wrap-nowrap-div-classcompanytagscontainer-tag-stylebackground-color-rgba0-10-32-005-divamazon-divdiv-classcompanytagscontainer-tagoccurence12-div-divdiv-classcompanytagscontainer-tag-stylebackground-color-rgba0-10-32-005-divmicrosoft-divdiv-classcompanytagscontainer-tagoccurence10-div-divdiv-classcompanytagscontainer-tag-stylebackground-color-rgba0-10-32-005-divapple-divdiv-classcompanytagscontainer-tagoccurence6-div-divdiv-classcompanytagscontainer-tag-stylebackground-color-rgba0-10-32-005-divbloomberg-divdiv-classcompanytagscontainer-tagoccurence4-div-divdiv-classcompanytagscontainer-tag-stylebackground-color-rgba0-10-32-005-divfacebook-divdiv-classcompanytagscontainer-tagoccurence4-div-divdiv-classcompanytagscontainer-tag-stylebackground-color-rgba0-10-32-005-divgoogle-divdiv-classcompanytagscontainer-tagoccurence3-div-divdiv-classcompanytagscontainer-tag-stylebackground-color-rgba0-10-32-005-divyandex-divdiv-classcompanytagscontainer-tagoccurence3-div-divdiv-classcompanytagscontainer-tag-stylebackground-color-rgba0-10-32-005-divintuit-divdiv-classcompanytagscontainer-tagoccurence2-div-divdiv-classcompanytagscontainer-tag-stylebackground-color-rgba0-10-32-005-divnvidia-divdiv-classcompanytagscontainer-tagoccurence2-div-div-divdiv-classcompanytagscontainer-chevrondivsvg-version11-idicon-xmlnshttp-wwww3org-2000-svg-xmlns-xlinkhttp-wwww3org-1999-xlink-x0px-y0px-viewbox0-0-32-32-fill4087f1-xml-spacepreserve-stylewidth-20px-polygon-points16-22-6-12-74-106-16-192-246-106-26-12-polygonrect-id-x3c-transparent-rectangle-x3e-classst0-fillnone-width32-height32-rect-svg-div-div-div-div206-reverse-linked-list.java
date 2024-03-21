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
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null; // If head is null, return null
        }
        
        List<ListNode> al = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            al.add(temp);
            temp = temp.next;
        }
        temp=null;
        ListNode res = null; // This will be the new head of the reversed list
        for(int i = al.size() - 1; i >= 0; i--) {
            if (res == null) {
                res = al.get(i);
                temp = res;  
            } 
            else{
                temp.next = al.get(i);
                temp = temp.next;
            }
        }
        temp.next = null; // Set the next of the last node to null to terminate the list
        return res;

    }
}


