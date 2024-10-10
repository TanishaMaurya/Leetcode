class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     int r=matrix.length;
    int c=matrix[0].length;
        int p=-1;
      for(int i=0;i<r;i++){
          if(matrix[i][0] <= target && matrix[i][c - 1] >= target){
              p=i;
              break;
          }
      }
        if (p == -1) {
            return false;
        }
        int a[]=new int[c];
        for(int i=0;i<c;i++){
            a[i]=matrix[p][i];
        }
        return binarysearch(a,0,a.length-1,target);
    }
    public boolean binarysearch(int a[],int l,int h,int target){
        int m=h+(l-h)/2;
        if(l>h){
            return false;
        }
        if(a[m]==target){
            return true;
        }
        else if(a[m]>target){
            return binarysearch(a,l,m-1,target);
        }else{
            return binarysearch(a,m+1,h,target);
        }
        
    }
}