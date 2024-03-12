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
    public ListNode removeZeroSumSublists(ListNode head) {
     Map<Integer,ListNode>m=new HashMap<>();
        ListNode d=new ListNode(0);
        d.next=head;
        m.put(0,d);
        int ps=0;
        while(head !=null){
            ps += head.val;
            if(!m.containsKey(ps)){
                m.put(ps,head);
            }else{
                ListNode start=m.get(ps);
                ListNode curr=start;
                int sum=ps;
                while(curr !=  head){
                    curr=curr.next;
                    sum += curr.val;
                    if(curr != head){
                        m.remove(sum);
                    }
                }
                start.next=head.next;
            }
            head=head.next;
        }
        return d.next;
    }
}