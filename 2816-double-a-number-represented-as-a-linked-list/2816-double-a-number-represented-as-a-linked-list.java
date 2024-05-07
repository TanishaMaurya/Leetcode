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
    public ListNode doubleIt(ListNode head) {
     ListNode h=new ListNode();
     h.next=head;
     ListNode left=h;
     ListNode right=head; 
        while(right !=null){
            if((right.val*2)>=10){
                left.val +=1;
            }
            right.val = (right.val*2)%10;
            left=left.next;
            right=right.next;
        }
        return (h.val>0) ? h :head;
    }
}