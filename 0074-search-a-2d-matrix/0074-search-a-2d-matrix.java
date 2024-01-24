class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int mm=matrix.length;
        int n=matrix[0].length-1;
        int m=0;
        while(m<mm && n>=0){
            if(matrix[m][n]==target){
                return true;
            }else if(matrix[m][n]>target){
                n--;
            }else{
                m++;
            }

        }
        return false;
    }
}