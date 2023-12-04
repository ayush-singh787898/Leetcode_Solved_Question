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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer>stk1=new Stack<>();
        Stack<Integer>stk2=new Stack<>();
        
        ListNode temp1=l1;
        ListNode temp2=l2;

        while(l1!=null){
            stk1.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            stk2.push(l2.val);
            l2=l2.next;
        }
        int carry=0;
        ListNode newHead=null;
        while(!stk1.isEmpty() || !stk2.isEmpty() || carry!=0){
            int n1=stk1.isEmpty()?0:stk1.pop();
            int n2=stk2.isEmpty()?0:stk2.pop();
            int temp=n1+n2+carry;
            ListNode newNode=new ListNode(temp%10);
            newNode.next=newHead;
            newHead=newNode;
            carry=temp/10;
        }
        return newHead;
    }
}