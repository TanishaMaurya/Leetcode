class Solution {
    public int findPeakElement(int[] nums) {
      
        if(nums.length<2){
            return 0;
              
        }
         int n=nums.length-1;
        if(nums[0]>nums[1]){
            return 0;
        }
        if(nums[n]>nums[n-1]){
            return n;
        }
        
        int l=1,h=n-1;
        while(l<=h){
            int m=(l+h)/2;
            if(nums[m-1]<nums[m] && nums[m]>nums[m+1]){
                return m;
            }
            else if(nums[m-1]>nums[m]){
                h=m-1;
            }else{
                
                l=m+1;
            }
            }
        return -1;
            
        }
    
}