class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int l1=text1.length(),l2=text2.length();
         int [][]dp=new int[l1+1][l2+1];
      
       for (int i = 1; i <= l1; i++) {
           for (int j = 1; j <= l2; j++) {
               dp[i][j] = -1; 
            
               
           }
       }
        return seq(text1,text2,l1,l2,dp);
        
    }
    public int seq(String text1,String text2,int l1,int l2,int[][] dp){
        if(l1==0 || l2==0) return dp[l1][l2]=0;
        if(dp[l1][l2]==-1) {
            if(text1.charAt(l1-1)==text2.charAt(l2-1)){
                return 1+seq(text1,text2,l1-1,l2-1,dp);
            }
            else{
            return dp[l1][l2]=Math.max(seq(text1,text2,l1-1,l2,dp),seq(text1,text2,l1,l2-1,dp));
            }
        }
        
        return dp[l1][l2];
    }
}

