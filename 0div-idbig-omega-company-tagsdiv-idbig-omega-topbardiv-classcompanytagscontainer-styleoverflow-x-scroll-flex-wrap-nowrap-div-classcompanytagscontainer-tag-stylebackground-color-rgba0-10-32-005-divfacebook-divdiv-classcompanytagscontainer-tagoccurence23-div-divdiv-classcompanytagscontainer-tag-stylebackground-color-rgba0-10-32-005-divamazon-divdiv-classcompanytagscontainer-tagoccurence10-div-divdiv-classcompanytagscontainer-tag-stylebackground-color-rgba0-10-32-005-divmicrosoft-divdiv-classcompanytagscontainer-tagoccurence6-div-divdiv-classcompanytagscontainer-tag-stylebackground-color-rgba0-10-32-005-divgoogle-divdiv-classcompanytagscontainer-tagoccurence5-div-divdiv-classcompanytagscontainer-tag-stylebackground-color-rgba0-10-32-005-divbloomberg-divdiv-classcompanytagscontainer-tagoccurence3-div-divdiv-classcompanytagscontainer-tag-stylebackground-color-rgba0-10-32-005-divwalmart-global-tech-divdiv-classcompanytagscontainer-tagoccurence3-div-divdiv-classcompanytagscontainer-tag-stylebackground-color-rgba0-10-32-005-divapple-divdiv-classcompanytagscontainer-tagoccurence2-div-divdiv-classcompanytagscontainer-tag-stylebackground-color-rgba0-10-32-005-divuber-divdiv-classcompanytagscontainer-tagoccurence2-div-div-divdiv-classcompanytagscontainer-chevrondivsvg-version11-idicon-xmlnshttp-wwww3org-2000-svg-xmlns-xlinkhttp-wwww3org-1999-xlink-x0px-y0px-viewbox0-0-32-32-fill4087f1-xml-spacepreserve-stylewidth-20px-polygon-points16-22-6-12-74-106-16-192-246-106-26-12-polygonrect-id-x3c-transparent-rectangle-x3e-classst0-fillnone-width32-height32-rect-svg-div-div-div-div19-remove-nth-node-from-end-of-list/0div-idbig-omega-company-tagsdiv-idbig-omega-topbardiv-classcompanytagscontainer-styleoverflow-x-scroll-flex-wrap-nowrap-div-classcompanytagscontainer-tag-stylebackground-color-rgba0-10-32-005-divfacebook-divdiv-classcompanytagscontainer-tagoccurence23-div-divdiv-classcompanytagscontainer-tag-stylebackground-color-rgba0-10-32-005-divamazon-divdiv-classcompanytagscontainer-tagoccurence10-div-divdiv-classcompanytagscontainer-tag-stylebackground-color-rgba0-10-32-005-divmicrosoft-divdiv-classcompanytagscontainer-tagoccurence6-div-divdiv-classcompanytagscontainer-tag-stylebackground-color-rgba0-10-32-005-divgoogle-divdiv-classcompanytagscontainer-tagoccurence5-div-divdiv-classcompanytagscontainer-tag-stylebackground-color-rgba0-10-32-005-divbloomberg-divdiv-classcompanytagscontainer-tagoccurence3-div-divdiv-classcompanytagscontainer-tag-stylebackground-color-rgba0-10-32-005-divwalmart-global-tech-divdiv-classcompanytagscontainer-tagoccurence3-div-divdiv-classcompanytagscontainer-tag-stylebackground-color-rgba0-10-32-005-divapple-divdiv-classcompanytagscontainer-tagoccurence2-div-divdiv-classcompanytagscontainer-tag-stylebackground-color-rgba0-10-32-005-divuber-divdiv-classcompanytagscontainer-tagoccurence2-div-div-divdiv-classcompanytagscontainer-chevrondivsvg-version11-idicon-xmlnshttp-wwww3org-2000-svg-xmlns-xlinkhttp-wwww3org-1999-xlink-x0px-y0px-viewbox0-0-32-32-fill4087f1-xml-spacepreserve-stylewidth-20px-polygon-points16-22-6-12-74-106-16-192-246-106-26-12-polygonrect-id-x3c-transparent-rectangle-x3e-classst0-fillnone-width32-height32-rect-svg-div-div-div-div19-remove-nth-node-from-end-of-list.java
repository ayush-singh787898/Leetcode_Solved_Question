
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    int size=0;
    ListNode temp=head;
        while(temp!=null){
            temp=temp.next;

            size++;
        }
        if(size==n){
            return head.next;
        }
        int indx=1;
        ListNode prev=head;
        int indxToFind=size-n;
        while(indx<indxToFind){
            prev=prev.next;
            indx++;
        }
        prev.next=prev.next.next;
        return head;
    }
}