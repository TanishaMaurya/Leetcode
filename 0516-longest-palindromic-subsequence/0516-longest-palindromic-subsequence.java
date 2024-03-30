class Solution {
     public static int finder(String s,int start,int end,int dp[][]){
        if(start>end){
            return dp[start][end]=0;
        }
        if(start==end){
            return dp[start][end]=1;
        }
        if(dp[start][end]!=-1){
            return dp[start][end];
        }
        if(s.charAt(start)==s.charAt(end)){
            return dp[start][end]=2+finder(s,start+1,end-1,dp);
        }else{
            return dp[start][end]=0+Math.max(finder(s,start+1,end,dp),finder(s,start,end-1,dp));
        }
        
    }
    public int longestPalindromeSubseq(String s) {
        int dp[][]=new int[s.length()][s.length()];
        for(int i=0;i<dp.length;i++)
        Arrays.fill(dp[i],-1);
        return finder(s,0,s.length()-1,dp);
    
    }
}