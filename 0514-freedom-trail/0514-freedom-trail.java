class Solution {
     private void turnR(int ringIdx, int keyIdx, String ring, String key, int dir, int dp[][]) {
        int idx = ringIdx;
        int count = 1;
        int turnCount = ring.length();
        
        while(turnCount > 0 ){
            if ( ring.charAt(idx) == key.charAt(keyIdx)) {
                if ( keyIdx > 0 ) {
                    if ( dp[keyIdx-1][ringIdx] != Integer.MAX_VALUE)  {
                        dp[keyIdx][idx] = Math.min(dp[keyIdx][idx], dp[keyIdx-1][ringIdx] + count);
                    }
                } else{
                    dp[keyIdx][idx] = Math.min(dp[keyIdx][idx], count);
                }
            }
            if ( dir == 0 ) {
                idx++;
            } else{
                idx--;
            }
            count++;
            if ( idx < 0 ) idx = ring.length()-1;
            if ( idx >= ring.length()) idx = 0;
            turnCount--;
        }
    }
    public int findRotateSteps(String ring, String key) {
          int dp[][] = new int[key.length()][ring.length()];
        for(int i = 0; i < dp.length; i++) {
            for(int j = 0; j < dp[i].length; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        turnR(0, 0, ring, key, 0, dp);
        turnR(0, 0, ring, key, 1, dp);

        for(int i = 1; i < key.length(); i++) {
            for(int j = 0; j < ring.length(); j++) {
                if ( dp[i-1][j] != Integer.MAX_VALUE) {
                    turnR(j, i, ring, key, 0, dp);
                    turnR(j, i, ring, key, 1, dp);
                }
            }
        }
          int min = Integer.MAX_VALUE;
        for(int j = 0; j < dp[dp.length-1].length; j++) {
            min = Math.min(min, dp[dp.length-1][j]);
        }
        
        return min;
    }
}