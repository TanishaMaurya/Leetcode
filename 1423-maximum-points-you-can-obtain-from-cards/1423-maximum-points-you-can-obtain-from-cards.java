class Solution {
    public int maxScore(int[] cardPoints, int k) {
     int n=cardPoints.length;
     int r=n-1;
        
      int l=0;
        int lsum=0,rsum=0;
        int maxsum=0;
     for(int i=0;i<k;i++){
         lsum += cardPoints[i];
     }
        maxsum = lsum;
        for(int i=k-1;i>=0;i--){
            lsum =lsum-cardPoints[i];
            rsum=rsum + cardPoints[r];
            r--;
            maxsum=Math.max(maxsum,lsum+rsum);
        }
        return maxsum;
    }
    
}