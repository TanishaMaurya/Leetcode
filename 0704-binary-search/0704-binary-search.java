class Solution {
    public int search(int[] nums, int target) {
       
     int ans=searchelement(0,nums.length-1,target,nums);
        return ans;
    }
    public int searchelement(int l,int r,int target,int[] nums){
        
        int m=l+(r-l)/2;
        while(l<=r){
            if(nums[m]==target){
                return m;
            }
        if(nums[m] >target){
          return  searchelement(l,m-1,target,nums);
        }
        else if(nums[m]<target){
            return searchelement(m+1,r,target,nums);
        }
        }
        return -1;
    }
}