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
    public boolean isPalindrome(ListNode head) {
        List<Integer>lst=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            lst.add(temp.val);
            temp=temp.next;
        }
        int i=0;
        int j=lst.size()-1;
        while(i<j){
            if(lst.get(i)!=lst.get(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}