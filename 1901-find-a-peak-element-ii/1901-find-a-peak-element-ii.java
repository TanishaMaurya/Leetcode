class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        int l=0,h=c-1,mid;
        while(l <= h){
          mid=l+(h-l)/2;
          int mr=0;
          for(int i=0;i<r;i++){
            if(mat[mr][mid]<mat[i][mid]){
              mr=i;
            }
          }
    if((mid==0 || mat[mr][mid]>mat[mr][mid-1]) && (mid==c-1 || mat[mr][mid] >mat[mr][mid+1]))
          return new int[] {mr,mid};
          else if(mid>0 && mat[mr][mid-1] > mat[mr][mid])
          h=mid-1;
          else
          l=mid+1;
        }
        return new int[] {-1,-1};
    }
}