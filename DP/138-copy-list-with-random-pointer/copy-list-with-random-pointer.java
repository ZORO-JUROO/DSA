/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;

        HashMap<Node,Node> arr=new HashMap<>(); 
        Node root=new Node(head.val);
        arr.put(head,root);
        Node curr=head.next;
        Node last=root;
        while(curr!=null)
        {
            Node latest=new Node(curr.val);
            arr.put(curr,latest);
            last.next=latest;
            last=latest;
            curr=curr.next;
        }
        curr=head;
        while(curr!=null)
        {
            if(curr.random!=null)
            arr.get(curr).random=arr.get(curr.random);
            curr=curr.next;
        }
        return root;
    }
}