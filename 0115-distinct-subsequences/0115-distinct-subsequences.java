class Solution {
    public int numDistinct(String s, String t) {
     int la=s.length(),lb=t.length();
         int[][] dp = new int[la][lb];
        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }
        return countseq(s,t,la-1,lb-1,dp);
    }
    public int countseq(String s,String t,int la,int lb,int[][] dp){
        if(lb<0) return 1;
        if(la<0) return 0;
         if(dp[la][lb] != -1) return dp[la][lb];
        if(s.charAt(la)==t.charAt(lb))
            return dp[la][lb]= countseq(s,t,la-1,lb-1,dp)+countseq(s,t,la-1,lb,dp);
        else
            return dp[la][lb]=countseq(s,t,la-1,lb,dp);
    }
}