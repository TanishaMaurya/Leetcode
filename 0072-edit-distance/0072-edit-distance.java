class Solution {
    public int minDistance(String word1, String word2) {
     int m=word1.length(),n=word2.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++) 
                dp[i][j]=-1;
        }
        return dist(word1,word2,m,n,dp);
    }
    public int dist(String word1,String word2,int m,int n,int[][] dp){
         if (m == 0) return n;
        if (n == 0) return m;
        if(dp[m][n] != -1) return dp[m][n];
         if (word1.charAt(m - 1) == word2.charAt(n - 1)) {
            return dp[m][n] = dist(word1, word2, m - 1, n - 1, dp);
        }
            int r=1+dist(word1,word2,m-1,n-1,dp);
            int i=1+dist(word1,word2,m,n-1,dp);
            int d=1+dist(word1,word2,m-1,n,dp);
            
            return dp[m][n]=Math.min(r,Math.min(d,i));
        
    }
}