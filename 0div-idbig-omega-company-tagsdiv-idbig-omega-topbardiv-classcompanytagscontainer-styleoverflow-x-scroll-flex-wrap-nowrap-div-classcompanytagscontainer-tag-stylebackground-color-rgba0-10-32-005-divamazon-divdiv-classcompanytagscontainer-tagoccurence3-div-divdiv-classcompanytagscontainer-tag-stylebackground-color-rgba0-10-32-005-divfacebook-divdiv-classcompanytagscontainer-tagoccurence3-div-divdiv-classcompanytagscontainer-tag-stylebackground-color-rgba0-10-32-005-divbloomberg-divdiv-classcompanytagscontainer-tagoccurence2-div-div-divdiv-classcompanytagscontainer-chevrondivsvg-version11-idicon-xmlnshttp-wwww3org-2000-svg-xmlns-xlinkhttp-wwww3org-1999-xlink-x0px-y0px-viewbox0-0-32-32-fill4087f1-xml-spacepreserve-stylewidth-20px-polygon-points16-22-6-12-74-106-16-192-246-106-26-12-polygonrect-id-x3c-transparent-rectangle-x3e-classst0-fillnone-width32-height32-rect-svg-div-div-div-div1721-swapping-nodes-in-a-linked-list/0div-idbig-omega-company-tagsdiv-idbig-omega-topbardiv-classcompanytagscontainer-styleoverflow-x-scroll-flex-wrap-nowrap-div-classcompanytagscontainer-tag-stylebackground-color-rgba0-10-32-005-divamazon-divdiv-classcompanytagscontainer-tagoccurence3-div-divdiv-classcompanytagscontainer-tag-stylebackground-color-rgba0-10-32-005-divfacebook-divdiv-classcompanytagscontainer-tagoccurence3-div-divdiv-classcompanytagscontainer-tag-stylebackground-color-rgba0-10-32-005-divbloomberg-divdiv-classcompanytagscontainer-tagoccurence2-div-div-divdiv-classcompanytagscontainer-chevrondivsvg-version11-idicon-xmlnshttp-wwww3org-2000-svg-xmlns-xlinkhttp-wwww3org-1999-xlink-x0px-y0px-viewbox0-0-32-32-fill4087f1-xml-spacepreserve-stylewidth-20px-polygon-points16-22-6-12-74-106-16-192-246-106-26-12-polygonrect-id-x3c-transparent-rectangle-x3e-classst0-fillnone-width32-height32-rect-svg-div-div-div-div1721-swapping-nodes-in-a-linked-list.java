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
        if(head==null){
            return head;
        }
        int sz = 1;
        ListNode temp = head;
        ListNode temp2 = head;
        int elm1 = 0;
        int elm2 = 0;

        // find kth element from start
        while (temp != null) {
            if (sz == k) {
                elm1 = temp.val;
            }
            temp = temp.next;
            sz++;
        }

        int i = 1;
        // find kth element from end
        while (temp2 != null) {
            if (i == sz - k) {
                elm2 = temp2.val;
            }
            temp2 = temp2.next;
            i++;
        }

        // swap kth element from start and end
        temp = head;
        int strtInx = 1;

        // put end value at start kth index.
        while (strtInx < k) {
            temp = temp.next;
            strtInx++;
        }
        temp.val = elm2;

        // put start value at kth end index.
        temp = head;
        int endInx = 1;
        while (endInx < sz - k) {
            temp = temp.next;
            endInx++;
        }
        temp.val = elm1;
        
        // System.out.println("elm1 "+elm1+" elm2 "+elm2);

        return head;
    }
}
