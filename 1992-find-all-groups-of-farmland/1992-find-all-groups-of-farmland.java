class Solution {
    
  public void dfs(int[][] land,int r,int c,int rr,int cc,int[] li){
      if(r<0 ||r>=rr||c<0||c>=cc||land[r][c]==0){
                return;
            }
      if(r<=li[0] &&  c<=li[1]){
          li[0]=r;
          li[1]=c;
      }
      if(r>=li[2] && c>=li[3]){
          li[2]=r;
          li[3]=c;
      }
      land[r][c]=0;
      dfs(land,r+1,c,rr,cc,li);
      dfs(land,r,c+1,rr,cc,li);
  }
    
    public int[][] findFarmland(int[][] land) {
     List<int[]> l=new ArrayList<>();
        int rr=land.length;
        int cc=land[0].length;
      for(int i=0;i<rr;i++){          
          for(int j=0;j<cc;j++){
             if(land[i][j]!=0){
                 int[] li=new int[]{i,j,i,j};
                 dfs(land,i,j,rr,cc,li);
                 l.add(li);
             } 
          }
      }
        return l.toArray(new int[l.size()][]);
    }
}