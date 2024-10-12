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
        ListNode temp = head;
        int sz = 0;
        while (temp != null) {
            sz++;
            temp = temp.next;
        }
        int x = 0;
        ListNode newNode = new ListNode(-1);
        temp = head;
        while (x < sz / 2) {
            temp = temp.next;
            x++;
        }
        System.out.println(temp.val);
        newNode.next = temp; 
        // System.out.println(temp);
        return newNode.next; 
    }
}
