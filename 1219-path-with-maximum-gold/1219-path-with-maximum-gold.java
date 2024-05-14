class Solution {
    int max=0;
    int sum=0;
    
    public int gold(int[][] grid,int i,int j,boolean visited[][]){
        if(i<0 ||j<0 || i>grid.length-1 || j>grid[0].length-1 || visited[i][j] || grid[i][j]==0){
            return 0;
        }
        visited[i][j]=true;
        sum += grid[i][j];
        int l=gold(grid,i-1,j,visited);
        int r=gold(grid,i+1,j,visited);
        int u=gold(grid,i,j-1,visited);
        int d=gold(grid,i,j+1,visited);
        visited[i][j]=false;
        return Math.max(l,Math.max(r,Math.max(u,d)))+ grid[i][j];
    }
       
    
    public int getMaximumGold(int[][] grid) {
        int r=grid.length;
            if(r==0) return 0;
        int c=grid[0].length;
      boolean visited[][]=new boolean[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum=0;
                if(grid[i][j]!=0 && !visited[i][j])
                max= Math.max(max,gold(grid,i,j,visited));
            }
        }
            return max;
    }
}