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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
        int c=1,i=1;
        while(curr.next!=null)
        {curr=curr.next;c++;}
        curr=head;
        if(c-n==0) return curr.next; 
        while(i++<c-n)
        {
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}