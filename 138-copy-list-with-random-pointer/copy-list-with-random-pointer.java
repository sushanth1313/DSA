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
        if(head==null) return head;
        Node cur=head;
        while(cur!=null){
            Node next1=new Node(cur.val);
            next1.next=cur.next;
            cur.next=next1;
            cur=next1.next;
        }
        cur=head;
        while(cur!=null){
            if(cur.random!=null){
              cur.next.random=cur.random.next;
              
            }
            cur=cur.next.next;
        }
        cur=head;
        
        Node two=head.next;
        Node one=two;
        while(cur!=null ){
        cur.next=one.next;
        cur=cur.next;
       
        if(cur!=null){
            one.next=cur.next;
            one=one.next;
        }}
        return two;
    }
}