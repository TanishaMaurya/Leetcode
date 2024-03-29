class Solution {
    Integer []dp;
    public int climbStairs(int n) {
        dp=new Integer[n+1];
        return climb(n,dp);
    }
    public int climb(int n,Integer[] dp){
        if(n==0 || n==1 || n==2){
            return n;
        }
        if(n<=1){
            return n;
        }
        if(dp[n]!=null){
            return dp[n];
        }
        dp[n]=climb(n-1,dp) + climb(n-2,dp);
        return dp[n];
    }
}