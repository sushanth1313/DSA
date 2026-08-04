/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
       if(head==null) return head;
       dfs(head);
       return head;
    }
    private Node dfs(Node head){
        Node cur=head;
        Node last=null;

        while(cur!=null){
            Node next=cur.next;
            if(cur.child!=null){
            Node chead=cur.child;
            Node tail=dfs(chead);
            cur.next=chead;
            chead.prev=cur;
            cur.child = null;
            
            if(next!=null){
             tail.next=next;
         next.prev=tail;
            }
            cur=tail;
            last=tail;
       }else{
        last=cur;
       }
           cur=cur.next;
          
        }
        return last;
       
    }
}