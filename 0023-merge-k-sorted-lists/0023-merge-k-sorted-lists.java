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
        if(lists == null || lists.length==0){
            return null;
        }
        ListNode dummy=new ListNode(-1);
        ListNode prev=dummy;

        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b) ->{
            return a.val - b.val;
        });
        for(int i=0;i<lists.length;++i){
            if(lists[i]!=null){
                pq.offer(lists[i]);
            }
        }

        while(pq.size() > 0){
            ListNode curr=pq.poll();
            prev.next=curr;
            prev=prev.next;

            if(curr.next != null){
                pq.offer(curr.next);
            }
        }
       return dummy.next;
       }
}