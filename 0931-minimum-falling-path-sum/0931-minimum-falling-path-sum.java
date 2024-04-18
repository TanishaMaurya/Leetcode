            
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++) Arrays.fill(dp[i], (int) -1e9);
        int res = (int) 1e9;
        for(int j = 0; j < n; j++) {
            if(dp[m-1][j] != (int) -1e9) res =  dp[m-1][j];
            res = Math.min(res, paths(m-1, j, matrix, dp));
            dp[m-1][j] = res;
        }
        return res;
    }

    int paths(int i, int j, int[][] matrix, int[][] dp) {
        if(j < 0 || j >= matrix[0].length) return (int) 1e9;
        if(i == 0) return matrix[0][j];
        if(dp[i][j] != (int) -1e9) return dp[i][j];
        int up = matrix[i][j] + paths(i-1, j-1, matrix, dp);
        int digonal1 = matrix[i][j] + paths(i-1, j, matrix, dp);
        int digonal2 = matrix[i][j] + paths(i-1, j+1, matrix, dp);
        return dp[i][j] = Math.min(up, Math.min(digonal1, digonal2));
    }
}