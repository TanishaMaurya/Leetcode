class Solution {
    public int minSwaps(int[] nums) {
     int su=0;
        for(int num:nums){
            su+=num;
        }
        if(su==0 || su==1)return 0;
        int s=0,e=-1;
        int n=nums.length;
        int min=n;
        int tem=0;
        while(s<n){
            e++;
            tem+=nums[e%n];
            if(e-s+1==su){
                System.out.println(s+" "+tem);
              min=Math.min(min,su-tem);
              tem-=nums[s++];
            }
        }
        return min;   
    }
}