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
    public ListNode reverseKGroup(ListNode head, int k) {
        int count=0;
        ListNode cur=head;
        while(count<k){
           if(cur==null){
            return head;
           }
           cur=cur.next;
           count++;
        }
        ListNode newnode=reverseKGroup(cur,k);
        count=0;
        cur=head;
        while(count<k){
           ListNode next=cur.next;
           
           cur.next=newnode;
           newnode=cur;
           cur=next;
           
          count++;

        }
        return newnode;
    }
}