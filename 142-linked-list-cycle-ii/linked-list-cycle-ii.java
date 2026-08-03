/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fst=head;

        while(fst!=null && fst.next!=null){
            slow=slow.next;
            fst=fst.next.next;
            
        
        if(fst==slow){
            while(head!=slow){
                head=head.next;
                slow=slow.next;
            }
            return slow;
        }
    }
    return null;
}
}