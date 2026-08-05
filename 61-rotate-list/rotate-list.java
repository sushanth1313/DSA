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
    if(head==null){
        return head;
    }
    int length=1;
    ListNode cur=head;
    while(cur.next!=null){
        cur=cur.next;
        length++;
    }
    k=k%length;
    if(k==0){
        return head;
    }
    ListNode first=head;
    cur.next=head;
    
    for(int i=0;i<length-k;i++){
        cur=cur.next;
        
    }
    ListNode newh=cur.next;
    cur.next=null;
    return newh;
    }
}