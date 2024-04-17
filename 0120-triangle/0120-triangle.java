class Solution {
    public static int solve(int i,int j,int n,List<List<Integer>> triangle,int [][]dp){
        if(i==n){
            return triangle.get(i).get(j);
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int down=Solution.solve(i+1,j,n,triangle,dp);
        int downRight=Solution.solve(i+1,j+1,n,triangle,dp);
        dp[i][j]=triangle.get(i).get(j)+Math.min(down,downRight);
        return dp[i][j];
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int m=triangle.size();
        int n=triangle.get(triangle.size()-1).size();
        int [][]dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return Solution.solve(0,0,triangle.size()-1,triangle,dp);
        
    }

}