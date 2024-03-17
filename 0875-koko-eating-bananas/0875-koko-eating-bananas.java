class Solution {
    public static int calculateTotalHours(int[] v, int hourly) {
        int totalH = 0;
        int n = v.length;
        //find total hours:
        for (int i = 0; i < n; i++) {
            totalH += Math.ceil((double)(v[i]) / (double)(hourly));
        }
        return totalH;
    }
    public int minEatingSpeed(int[] piles, int h) {
        
        // find largest element in array
         int ma = Arrays.stream(piles).max().getAsInt(); 
        int ans=Integer.MAX_VALUE;
        int n=piles.length;
        int l=1,r=ma;
       
        while(l<=r){
             int t=0;
            int m=l+(r-l)/2;
           
               t=calculateTotalHours(piles, m);
            
            if(t <= h){
                ans=m;
                r=m-1;
            }else {
                l=m+1;
            }
        }
        return l;
    }
}