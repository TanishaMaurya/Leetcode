class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n=happiness.length;
     
        long sum=0;
        int c=0;
      
            for(int j=n-1;j>=0 && k>0 ;j--){
          sum += Math.max(happiness[j]-c,0);   
          c++;
                k--;
        }
        return sum;
    }
}

        