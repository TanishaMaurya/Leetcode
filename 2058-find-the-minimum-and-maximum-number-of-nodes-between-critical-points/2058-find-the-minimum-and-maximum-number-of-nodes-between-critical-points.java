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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
     int []res={-1,-1};
        int mini=Integer.MAX_VALUE;
        ListNode prev=head;
        ListNode curr=head.next;
       int currentIndex = 1;
        int previousCriticalIndex = 0;
        int firstCriticalIndex = 0;
        while(curr.next!=null){
            if((curr.val <prev.val && curr.val < curr.next.val) || (curr.val>prev.val && curr.val>curr.next.val)){
                if(previousCriticalIndex==0){
                 previousCriticalIndex=currentIndex;
                    firstCriticalIndex=currentIndex;
                }else{
                    mini=Math.min(mini,currentIndex-previousCriticalIndex);
                    previousCriticalIndex=currentIndex;
                }
            }
            currentIndex++;
            prev=curr;
            curr=curr.next;
        }
        if(mini!=Integer.MAX_VALUE){
            int maxi=previousCriticalIndex-firstCriticalIndex;
            res=new int[]{mini,maxi};
        }
        return  res;
    } 
}