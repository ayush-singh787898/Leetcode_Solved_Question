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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode temp =list1;
        int x = 0;
        int y = 0;
        
        // Move temp to the node after b
        while (y <= b) {
            temp = temp.next;
            y++;
        }
        // Move temp1 to the node at a - 1
        while (x < a - 1) {
            temp1 = temp1.next;
            x++;
        }

        // Attach list2 to temp1
        temp1.next = list2;

        // Find the end of list2
        while (temp2.next != null) {
            temp2 = temp2.next;
        }
        // Connect the end of list2 to the node after b
        temp2.next = temp;
        return list1;
    }
}
