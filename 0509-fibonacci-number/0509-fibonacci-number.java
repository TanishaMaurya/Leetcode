class Solution {
    Integer[] dp;
    public int fib(int n) {
         dp=new Integer[n+1];
      
        return solu(n);
        
    }
    public int solu(int n){
        if(dp[n]==null){
            if(n<=1)
                return n;
            else {
                dp[n]=solu(n-1)+solu(n-2);
            }
        }
        return dp[n];
    }
}

  
  