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
 
// class Solution {
//     public ListNode deleteMiddle(ListNode head) {
//         // Base case: if the list is empty or has only one node, return null
//         if (head == null || head.next == null) {
//             return null;
//         }

//         // Step 1: Find the size of the linked list
//         ListNode temp = head;
//         int size = 0;
//         while (temp != null) {
//             size++;
//             temp = temp.next;
//         }

//         // Step 2: Calculate the index of the middle node
//         int mid = size / 2;

//         // Step 3: Traverse to the node just before the middle node
//         temp = head;
//         int inx = 0;
//         while (inx < mid - 1) {
//             temp = temp.next;
//             inx++;
//         }

//         // Step 4: Skip the middle node
//         temp.next = temp.next.next;

//         // Return the head of the modified list
//         return head;
//     }
// }



class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        return head;
    }
}



























