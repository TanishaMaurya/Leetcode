class Solution {
    
    public boolean canp(int i,int n,int t,int[] nums,Boolean[][] dp){
        if(i>=n) return false;
        if(t <0) return false;
        if(t==0) return true;
        
        if(dp[i][t] !=null) return dp[i][t];
        // if (dp[i][t] != null) return dp[i][t];

        
        boolean inc= canp(i+1,n,t-nums[i],nums,dp);
        boolean out=canp(i+1,n,t,nums,dp); 
        
        return dp[i][t]=(inc || out);
        
        
    }
    
    public boolean canPartition(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i:nums){
            sum+=i;
        }
        if(sum%2 !=0) return false;
        int target=sum/2;
        Boolean dp[][]=new Boolean[n][target+1];
         return canp(0,n,target,nums,dp);
    }
}