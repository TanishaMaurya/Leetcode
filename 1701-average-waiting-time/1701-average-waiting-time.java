class Solution {
    public double averageWaitingTime(int[][] customers) {
     int now=0; 
        double res=0;
        for (int[] customer : customers) {
        int arrival = customer[0];
        int time = customer[1];
        now = Math.max(arrival, now);
        now += time;
        res += now - arrival;
    }
        return res/customers.length;
    }
}