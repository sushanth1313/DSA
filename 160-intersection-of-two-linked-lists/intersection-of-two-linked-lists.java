/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=len(headA);
        int lenB=len(headB);
        while(lenA>lenB){
        headA=headA.next;
        lenA--;
        }while(lenB>lenA){
        headB=headB.next;
        lenB--;
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        } 
    return headA;
        }
        private int len(ListNode head){
          int count=0;
          while(head.next!=null){
            head=head.next;
            count++;

          }
          return count;
        }
    }
