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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0){
            return null;
        }
       return mergehelper(lists,0,lists.length-1);
    }
    private ListNode mergehelper(ListNode list[],int st,int end){
        if(st==end){
            return list[st];
        }
        if(st+1==end){
            return merge(list[st],list[end]);
        }
        int mid=st+(end-st)/2;
       ListNode left= mergehelper(list,st,mid);
       ListNode right= mergehelper(list,mid+1,end);
        return merge(left,right);
            }
    private ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(0);
        ListNode cur=dummy;
        while(l1!=null && l2!=null){
        if(l2.val>=l1.val){
          cur.next=l1;
          l1=l1.next;
        }else{
            cur.next=l2;
            l2=l2.next;
        }
        cur=cur.next;
        }
        if(l1!=null){
            cur.next=l1;
        }
         if(l2!=null){
            cur.next=l2;
        }
         return dummy.next;
    
    }
   
}