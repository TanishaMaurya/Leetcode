class Solution {
    public int uniquePaths(int m, int n) {
       int [][]dp=new int[m][n];
       for (int i = 0; i < m; i++) {
           for (int j = 0; j < n; j++) {
               dp[i][j] = -1; 
           }
       }
       return paths(m, n, dp);
    }

    public int paths(int m, int n, int[][] dp) {
        if (m == 1 || n == 1) {
            return 1;
        }
        if (dp[m - 1][n - 1] == -1) {
            dp[m - 1][n - 1] = paths(m - 1, n, dp) + paths(m, n - 1, dp);
        }
        return dp[m - 1][n - 1];
    }
}