class Solution {
  public int maxEnvelopes(int[][] envelopes) {

        if(envelopes.length == 1) return 1;



        Arrays.sort(envelopes,(int[]a,int[]b) -> {return a[0] == b[0] ? b[1]-a[1] : a[0] - b[0];}); 

        return LIS(envelopes);
    }

    public int LIS(int[][] envelopes) {

        int len = 0;
        int []dp = new int[envelopes.length];
        for(int env[] : envelopes) {
            int height = env[1];
            int index = Arrays.binarySearch(dp,0,len,height); 

            if(index < 0) index = -index - 1;
            if(index==len) len++;

            dp[index] = height; 
        }

        return len;
    }
}