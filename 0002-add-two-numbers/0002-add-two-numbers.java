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
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         List<Integer>al=new ArrayList<>();
//         int sum=0;
//         ListNode x=l1;
//         ListNode y=l2;
//         int carry=0;
//         if(x==null && y==null){
//             return null;
//         }
// // case-1 when x and y are not null
        
//         while(x!=null && y!=null){
//             sum=x.val+y.val+carry;
//             if(sum>9){
//                 int n=sum;
//                 while(n>9){
//                     int temp=n%10;
//                     n=n/10;
//                     al.add(temp);
//                     carry=n;   
//                 }
//             }
//             else{
//                 al.add(sum);
//             }
//             x=x.next;
//             y=y.next;
//         }

        

//         System.out.println(al);
//         return l1;
//     }
// }


























class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry =0;
        ListNode newHead = new ListNode(0);
        ListNode p1 = l1, p2 = l2, p3=newHead;
        while(p1 != null || p2 != null)
        {
            if(p1 != null)
            {
                carry += p1.val;
                p1 = p1.next;
            }
            if(p2 != null)
            {
                carry += p2.val;
                p2 = p2.next;
            }
            p3.next = new ListNode(carry%10);
            p3 = p3.next;
            carry /= 10;
        }
        if(carry==1)
            p3.next=new ListNode(1);
        return newHead.next;
    }
}
