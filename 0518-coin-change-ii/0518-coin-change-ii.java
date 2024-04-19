class Solution {
    
    public int amountch(int amount,int[] coins,int i,int[][] dp){
        if(i==0){
            if(amount%coins[0]==0) return 1;
            else return 0;
        } 
        if(dp[i][amount] != -1) return dp[i][amount];
        int nottake=amountch(amount,coins,i-1,dp);
        int take=0;
        if(coins[i]<=amount) {
             take=amountch(amount-coins[i],coins,i,dp);
        }
        return dp[i][amount]=take + nottake;
    }
    
    public int change(int amount, int[] coins) {
        int n=coins.length;
       
        int dp[][]=new int[n][amount+1];
      for(int[]row:dp)
        {
            Arrays.fill(row,-1);
        }
        return amountch(amount,coins,n-1,dp);
    }
}