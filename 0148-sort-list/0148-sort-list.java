class Solution {
    // Main function to sort the linked list using merge sort
    public ListNode sortList(ListNode head) {
        // Base case: if the list is empty or contains one node, it's already sorted
        if (head == null || head.next == null) {
            return head;
        }

        // Step 1: Split the list into two halves
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        // Find the middle of the list using slow and fast pointers
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Split the list into two parts by setting the previous node's next to null
        prev.next = null;

        // Step 2: Recursively sort both halves
        ListNode left = sortList(head);  // Sort the left half
        ListNode right = sortList(slow);  // Sort the right half

        // Step 3: Merge the sorted halves
        return mergeSort(left, right);
    }

    // Function to merge two sorted linked lists
    private ListNode mergeSort(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);  // Dummy node to hold merged list
        ListNode curr = dummy;

        // Merge both lists until one is exhausted
        while (left != null && right != null) {
            if (left.val < right.val) {
                curr.next = left;
                left = left.next;
            } else {
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;  // Move to the next node
        }

        // Attach the remaining part of the list
        if (left != null) {
            curr.next = left;
        }
        if (right != null) {
            curr.next = right;
        }

        return dummy.next;  // Return the merged sorted list
    }
}
