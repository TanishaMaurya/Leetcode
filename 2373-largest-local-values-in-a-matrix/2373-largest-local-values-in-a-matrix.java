class Solution {
    public int[][] largestLocal(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int tar=0;
        int ans[][]=new int[r-2][r-2];
        for(int i=0;i<r-2;i++){
            for(int j=0;j<c-2;j++){
                tar=grid[i+1][j+1];
                if(grid[i][j]>tar) tar=grid[i][j];
                if(grid[i][j+1]>tar) tar=grid[i][j+1];
                if(grid[i][j+2]>tar) tar=grid[i][j+2];
                if(grid[i+1][j]>tar) tar=grid[i+1][j];
                if(grid[i+1][j+2]>tar) tar=grid[i+1][j+2];
                if(grid[i+2][j+1]>tar) tar=grid[i+2][j+1];
                if(grid[i+2][j]>tar) tar=grid[i+2][j];
                if(grid[i+2][j+2]>tar) tar=grid[i+2][j+2];
                ans[i][j]=tar;
            }
        }
        return ans;
    }
}