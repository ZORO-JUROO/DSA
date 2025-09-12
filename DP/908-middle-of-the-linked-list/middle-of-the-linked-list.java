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
    public ListNode middleNode(ListNode head) {
        ListNode curr=head,next=head.next;
        int c=1;
        while(next!=null)
        {c++;curr=next;next=curr.next;}
        c=(int)Math.floor(c/2)+1;
        int i=1;
        curr=head;next=head.next;
        while(i<c)
        {
            curr=next;next=curr.next;
            i++;
        }
        return curr;

    }
}