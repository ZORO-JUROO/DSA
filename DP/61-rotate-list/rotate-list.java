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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode papa=null,fast=head;int n=0,i=0;
        while(fast!=null)
        {
            papa=fast;
            fast=fast.next;
            n++;
        }
        if(head==null || k%n==0) return head;
        k=n-(k%n)-1;fast=head;
        while(i++<k)
        {
            fast=fast.next;
        }
        System.out.println(fast.val);
        ListNode naya=fast.next;
        fast.next=null;
        papa.next=head;
        return naya;
    }
}