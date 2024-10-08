class Solution {
    public void moveZeroes(int[] nums) {
       int n=nums.length; 
        int nonzero=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0) 
                nums[nonzero++]=nums[i];
        }
        while(nonzero !=n){
            nums[nonzero++]=0;
        }
        
    }
}