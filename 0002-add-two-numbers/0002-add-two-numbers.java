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
        int sum=0;
        ListNode x=l1;
        ListNode y=l2;
        ListNode newNode=new ListNode(0);
        ListNode z=newNode;
        int carry=0;
        if(x==null && y==null){
            return null;
        }
        
        while(x!=null || y!=null){
            sum+=carry;
            if(x!=null){
                sum+=x.val;
                x=x.next;
                
            }
            if(y!=null){
                sum+=y.val;
                y=y.next;
            }
            z.next=new ListNode(sum%10);
            z=z.next;
            sum=sum/10;
        
        }
        if(sum==1){
            z.next=new ListNode(sum);
        }
        return newNode.next;
    }
}


























// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         int carry =0;
        // ListNode newHead = new ListNode(0);
//         ListNode p1 = l1, p2 = l2, p3=newHead;
//         while(p1 != null || p2 != null)
//         {
//             if(p1 != null)
//             {
//                 carry += p1.val;
//                 p1 = p1.next;
//             }
//             if(p2 != null)
//             {
//                 carry += p2.val;
//                 p2 = p2.next;
//             }
//             p3.next = new ListNode(carry%10);
//             p3 = p3.next;
//             carry /= 10;
//         }
//         if(carry==1)
//             p3.next=new ListNode(1);
//         return newHead.next;
//     }
// }
