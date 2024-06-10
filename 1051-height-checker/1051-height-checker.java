class Solution {
    public int heightChecker(int[] heights) {
     int n=heights.length,c=0;
        int[] expected=new int[n];
        for(int i=0;i<n;i++){
            expected[i]=heights[i];
        }
        Arrays.sort(expected);
        for(int i=0;i<n;i++){
            if(expected[i]!=heights[i])
                c++;
        }
        return c;
    }
}