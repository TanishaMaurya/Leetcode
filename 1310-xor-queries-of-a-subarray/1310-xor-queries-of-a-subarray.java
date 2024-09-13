class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n1=arr.length;
        int n2=queries.length;
        int[] ans=new int[n2];
        for(int i=0;i<n2;i++){
            int x=queries[i][0];
            int y=queries[i][1];
            int z=0;
            for(int p=x;p<=y;p++){
                z=z^arr[p];
            }
            ans[i]=z;
        }
        return ans;
    }
}