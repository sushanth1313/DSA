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
    public ListNode partition(ListNode head, int x) {
        ListNode small =new ListNode(0);
        ListNode big=new ListNode(0);
        ListNode sp=small;
        ListNode bp=big;
        while(head!=null){
            if(head.val<x){
           sp.next=head;
            sp=sp.next;
        
        }
        if(head.val>=x){
           bp.next=head;
            bp=bp.next;
            
        }
        head=head.next;

         
        }
        bp.next=null;
        sp.next=big.next;
     
        return small.next;
        
    }
}