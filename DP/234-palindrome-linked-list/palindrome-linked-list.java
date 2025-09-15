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
        ListNode curr=head;String a="";
        while(curr!=null)
        {
            a+=curr.val;
            curr=curr.next;
        }
        int n=a.length();
        for(int i=0;i<n/2;i++)
        if(a.charAt(i)!=a.charAt(n-i-1))
        return false;
        return true;
    }
}