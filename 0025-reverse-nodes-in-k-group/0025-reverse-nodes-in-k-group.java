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
           int count =0;
        ListNode temp=head;
		//traversing to the node after k nodes that is between head an temp there are k nodes 
        while (temp!=null && count<k){
            count++;
            temp=temp.next;
        }
		// our negative base case incase nodes left are less than k
        if(count<k) return head;
		
		//making tail as same position as head as after reversal head node will be tail
        ListNode tail=head;
		//get reverse of first k nodes and front becomes our starting point of linked list 
        ListNode front=reverse(head,k);
		// now connecting tail to other reversed nodes (recursion)
        tail.next=reverseKGroup(temp,k);
		//return starting point
        return front;
    }

    private static ListNode reverse(ListNode head, int n) {
    ListNode prev=null;
    ListNode curr=head;
    while (n--!=0){
        ListNode ahead=curr.next;
        curr.next=prev;
        prev=curr;
        curr=ahead;
    }
    return prev;
    }
}