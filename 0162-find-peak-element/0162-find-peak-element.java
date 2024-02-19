class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int p=0;
        for(int i=0;i<n-1;i++){
              if(nums[i+1]>nums[i]){
                  p=(i+1);
              }
              else{
                  continue;
              }
        }
        return p;
    }
}