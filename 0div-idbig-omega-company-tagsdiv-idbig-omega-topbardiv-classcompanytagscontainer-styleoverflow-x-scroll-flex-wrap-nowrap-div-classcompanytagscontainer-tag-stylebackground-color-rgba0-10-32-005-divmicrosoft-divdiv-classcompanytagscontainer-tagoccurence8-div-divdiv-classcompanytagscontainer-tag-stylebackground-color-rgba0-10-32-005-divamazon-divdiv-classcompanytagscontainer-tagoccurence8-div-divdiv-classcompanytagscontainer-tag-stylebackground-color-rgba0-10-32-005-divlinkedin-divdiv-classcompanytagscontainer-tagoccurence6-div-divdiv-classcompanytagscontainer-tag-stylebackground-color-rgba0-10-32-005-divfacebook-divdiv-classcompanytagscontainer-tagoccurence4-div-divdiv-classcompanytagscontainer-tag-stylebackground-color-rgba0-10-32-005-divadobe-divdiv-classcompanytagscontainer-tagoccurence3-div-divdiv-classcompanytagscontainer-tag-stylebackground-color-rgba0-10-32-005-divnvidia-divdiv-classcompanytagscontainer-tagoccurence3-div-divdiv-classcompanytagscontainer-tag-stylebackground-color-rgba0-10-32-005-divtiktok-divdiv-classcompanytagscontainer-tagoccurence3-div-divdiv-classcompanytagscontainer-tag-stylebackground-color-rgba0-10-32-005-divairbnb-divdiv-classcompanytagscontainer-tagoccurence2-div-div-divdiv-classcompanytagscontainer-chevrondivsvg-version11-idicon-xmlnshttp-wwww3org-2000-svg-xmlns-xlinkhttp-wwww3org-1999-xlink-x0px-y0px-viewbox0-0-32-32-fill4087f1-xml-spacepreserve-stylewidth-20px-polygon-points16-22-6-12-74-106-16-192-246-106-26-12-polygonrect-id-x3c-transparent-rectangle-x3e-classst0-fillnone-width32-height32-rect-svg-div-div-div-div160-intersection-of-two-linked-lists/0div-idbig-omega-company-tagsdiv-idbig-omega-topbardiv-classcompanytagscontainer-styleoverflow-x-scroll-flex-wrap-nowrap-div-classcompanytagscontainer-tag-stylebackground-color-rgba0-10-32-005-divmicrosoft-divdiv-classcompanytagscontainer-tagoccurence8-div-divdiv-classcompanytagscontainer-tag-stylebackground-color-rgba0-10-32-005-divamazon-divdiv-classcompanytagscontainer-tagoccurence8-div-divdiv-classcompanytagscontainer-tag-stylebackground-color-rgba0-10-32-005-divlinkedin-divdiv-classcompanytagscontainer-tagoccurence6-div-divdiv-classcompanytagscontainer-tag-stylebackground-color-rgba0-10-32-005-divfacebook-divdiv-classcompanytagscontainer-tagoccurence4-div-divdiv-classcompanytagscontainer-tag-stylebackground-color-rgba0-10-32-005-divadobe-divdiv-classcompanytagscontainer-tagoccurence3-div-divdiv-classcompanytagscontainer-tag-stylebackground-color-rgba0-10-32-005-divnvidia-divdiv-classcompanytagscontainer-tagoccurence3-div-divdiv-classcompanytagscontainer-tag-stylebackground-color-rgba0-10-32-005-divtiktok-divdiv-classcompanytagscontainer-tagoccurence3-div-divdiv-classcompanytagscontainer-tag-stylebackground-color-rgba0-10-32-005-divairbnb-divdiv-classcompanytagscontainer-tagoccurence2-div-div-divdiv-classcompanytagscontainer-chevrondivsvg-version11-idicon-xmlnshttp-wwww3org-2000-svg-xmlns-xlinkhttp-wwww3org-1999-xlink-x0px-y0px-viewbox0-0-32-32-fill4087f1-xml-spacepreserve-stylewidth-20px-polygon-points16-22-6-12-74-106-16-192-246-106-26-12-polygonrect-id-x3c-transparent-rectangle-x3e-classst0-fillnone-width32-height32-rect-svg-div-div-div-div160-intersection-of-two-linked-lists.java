public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // If either list is empty, there's no intersection
        if (headA == null || headB == null) {
            return null;
        }

        // Initialize two pointers
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        // Traverse both lists. When one pointer reaches the end, switch it to the other list's head.
        while (temp1 != temp2) {
            // If temp1 reaches the end of list A, redirect it to the head of list B
            temp1 = (temp1 == null) ? headB : temp1.next;
            // If temp2 reaches the end of list B, redirect it to the head of list A
            temp2 = (temp2 == null) ? headA : temp2.next;
        }

        // When temp1 == temp2, it is either the intersection point or null (if there's no intersection)
        return temp1;
    }
}
