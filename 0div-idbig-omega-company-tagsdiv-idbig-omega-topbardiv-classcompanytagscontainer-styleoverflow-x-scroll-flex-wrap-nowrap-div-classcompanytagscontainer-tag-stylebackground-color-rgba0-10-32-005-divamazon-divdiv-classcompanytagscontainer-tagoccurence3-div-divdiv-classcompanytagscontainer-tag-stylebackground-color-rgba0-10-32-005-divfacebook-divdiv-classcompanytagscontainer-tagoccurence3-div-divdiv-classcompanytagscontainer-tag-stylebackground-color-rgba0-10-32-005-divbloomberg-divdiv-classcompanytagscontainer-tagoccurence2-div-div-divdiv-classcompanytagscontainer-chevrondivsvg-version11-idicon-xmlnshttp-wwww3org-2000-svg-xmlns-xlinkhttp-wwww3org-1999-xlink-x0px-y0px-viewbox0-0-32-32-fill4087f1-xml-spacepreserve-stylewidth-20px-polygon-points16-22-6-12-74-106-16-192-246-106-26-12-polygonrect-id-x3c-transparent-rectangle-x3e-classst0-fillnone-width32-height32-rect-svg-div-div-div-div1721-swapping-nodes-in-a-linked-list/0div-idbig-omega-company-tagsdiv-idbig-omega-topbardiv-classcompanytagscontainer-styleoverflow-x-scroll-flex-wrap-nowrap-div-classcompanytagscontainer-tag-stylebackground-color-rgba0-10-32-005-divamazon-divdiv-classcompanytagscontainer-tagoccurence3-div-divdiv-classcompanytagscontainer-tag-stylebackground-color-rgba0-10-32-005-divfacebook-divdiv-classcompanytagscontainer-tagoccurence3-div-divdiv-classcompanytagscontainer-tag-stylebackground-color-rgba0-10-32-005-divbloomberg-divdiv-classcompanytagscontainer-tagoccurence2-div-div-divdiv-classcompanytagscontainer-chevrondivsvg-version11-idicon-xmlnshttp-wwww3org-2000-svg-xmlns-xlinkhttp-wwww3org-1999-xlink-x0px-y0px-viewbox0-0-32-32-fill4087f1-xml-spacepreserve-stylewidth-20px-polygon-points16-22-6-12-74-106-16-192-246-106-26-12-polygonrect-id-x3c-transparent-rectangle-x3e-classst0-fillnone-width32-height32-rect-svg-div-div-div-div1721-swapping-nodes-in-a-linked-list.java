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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode pt1 = head, pt2 = head;
        for (int i = 1; i < k; i++) {
            pt1 = pt1.next;
        }
        ListNode first_k = pt1;
        int x = first_k.val;
        while (pt1.next != null) {
            pt1 = pt1.next;
            pt2 = pt2.next;
        }
        first_k.val = pt2.val;
        pt2.val = x;
        return head;
    }
}

