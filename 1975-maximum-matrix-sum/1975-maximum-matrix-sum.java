class Solution {
    public long maxMatrixSum(int[][] matrix) {
     int n=matrix.length;   
        int countneg=0,minVal=Integer.MAX_VALUE;
        long sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum +=Math.abs(matrix[i][j]);
                
                 minVal=Math.min(minVal,Math.abs(matrix[i][j]));
                
                if(matrix[i][j]<0){
                    countneg++;
                }
               
            }
        }
        if(countneg%2==0) return sum;
        return sum-2*minVal;
    }
}