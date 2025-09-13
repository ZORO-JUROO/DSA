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
        int carry=0;
        ListNode h=l2,prev=null;
        while(l1!=null && l2!=null)
        {
            int s=l2.val+l1.val+carry;
            l2.val=s%10;
            carry=s/10;
            l1=l1.next;
            prev=l2;
            l2=l2.next;
        }
        if(l1!=null)
        {
            prev.next=l1;
            l2=l1;
            prev=l2;
        }
        while(l2!=null)
        {
            int s=l2.val+carry;
            l2.val=s%10;
            carry=s/10;
            prev=l2;
            l2=l2.next;
        }
        if(carry!=0)
        {ListNode a=new ListNode(carry);prev.next=a;}
        return h;

    }
}