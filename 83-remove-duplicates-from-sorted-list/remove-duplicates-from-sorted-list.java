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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode();
        dummy.next=head;
        while(head!=null && head.next!=null){
        ListNode next=head.next;
            if(head.val==next.val){
                head.next=next.next;
            }else{
            head=head.next;
            }
        }
        return dummy.next;
    }
}