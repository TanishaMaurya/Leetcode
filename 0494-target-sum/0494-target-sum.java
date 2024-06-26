class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int Sum=0;
        for(int num:nums)
        Sum+=num;

        if(Math.abs(target)> Sum || (Sum+target)%2==1)
        return 0;

        int targetSum=(Sum+target)/2;
        int dp[][]=new int[nums.length+1][targetSum+1];

        dp[0][0]=1;

        for(int i=1;i<=nums.length;i++){
            for(int j=0;j<=targetSum;j++){
            if(nums[i-1]>j)
            dp[i][j]=dp[i-1][j];
            else
            dp[i][j]=dp[i-1][j]+dp[i-1][j-nums[i-1]];
        }
        }
        
        
        return dp[nums.length][targetSum];

    }
}