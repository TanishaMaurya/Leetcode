class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
      int n=s.length();
     int maxi=0;
     boolean dp[]=new boolean[n+1];
     dp[0]=true;
     for(String st:wordDict){
        maxi=Math.max(st.length(),maxi);
     }   
     for(int i=0;i<=n;i++){
        for(int j=i-1;j>=Math.max(i-maxi-1,0);j--){
            if(dp[j]){
                if(wordDict.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
     }
     return dp[n];   
    }
}