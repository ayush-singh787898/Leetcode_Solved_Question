class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy node to store the result list
        ListNode addedNode = new ListNode(-1); 
        ListNode temp = addedNode; // Pointer to traverse the result list
        int carry = 0; // Carry for sum of digits

        // Loop until both lists are exhausted
        while (l1 != null || l2 != null) {
            // Get the values from the current nodes of both lists, or 0 if null
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            
            // Calculate the sum of current digits and carry
            int sum = x + y + carry;
            carry = sum / 10; // Update carry for next iteration
            
            // Create a new node with the digit value (sum % 10)
            temp.next = new ListNode(sum % 10);
            temp = temp.next; // Move the pointer forward
            
            // Move to the next nodes in both lists, if they exist
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // If there is still a carry after the final addition, add a new node
        if (carry != 0) {
            temp.next = new ListNode(carry);
        }

        // Return the result list starting from the first valid node (skip the dummy node)
        return addedNode.next;
    }
}
