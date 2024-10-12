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
    
    // Recursive function to reverse the list
    
    public static ListNode recursiveReverse(ListNode head, ListNode curr, ListNode prev) {
        // Base case: if we reach the end of the list, return the previous node as the new head
        if (curr == null) {
            head = prev;
            return head;
        }
        
        ListNode next = curr.next;  // Store the next node
        curr.next = prev;           // Reverse the current node's pointer
        
        // Recursive call with updated pointers
        return recursiveReverse(head, next, curr);
    }

    // Function to initiate the recursive reversal
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        
        // Start recursion with the initial head, current, and previous pointers
        return recursiveReverse(head, curr, prev);
    }
}
