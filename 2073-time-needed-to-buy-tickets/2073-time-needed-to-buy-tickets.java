class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
     Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<tickets.length;i++) q.add(i);
        int time=0;
        while(!q.isEmpty()){
            time++;
            int idfront=q.peek();
            q.poll();
            tickets[idfront]--;
            
            if(k==idfront && tickets[idfront]==0) return time;
            if(tickets[idfront]!=0) q.add(idfront);
        }
        return time;
    }
}