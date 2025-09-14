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
    ListNode[] reverse(ListNode head,int k)
    {
        System.out.println("hi");
        ListNode prev=null,curr=head,next;
        while(curr!=null && k-->0)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        System.out.println("yo");
        return new ListNode[]{prev,head};
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev=new ListNode(),phead=head,curr=head;
        ListNode cc=prev;int i=0;
        while(curr!=null)
        {
            curr=curr.next;
            i++;
            if(i==k)
            {
                ListNode l[]=reverse(phead,k);
                System.out.println("fi");
                prev.next=l[0];
                prev=l[1];
                i=0;
                phead=curr;
            }
        }
        if(i!=0)
        prev.next=phead;
        return cc.next;
    }
}