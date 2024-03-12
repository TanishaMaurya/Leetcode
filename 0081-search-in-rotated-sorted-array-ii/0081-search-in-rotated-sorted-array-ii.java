class Solution {
    public boolean search(int[] nums, int target) {
        int l=0,h=nums.length-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]==target){
                return true;
            }
            else if(nums[l]<nums[m]){
                if(target >= nums[l] && target < nums[m]){
                    h=m-1;
                }else{
                    l=m+1;
                }
            }else if(nums[l] > nums[m]){
                if(target > nums[m] && target<= nums[nums.length-1]){
                    l=m+1;
                }else{
                    h=m-1;
                }
            }else{
                l++;
            }
        }
        return false;
    }
}

     
           
      