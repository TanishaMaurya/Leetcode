class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n;j++){
             if(nums[i]>nums[j]){
                 int temp=nums[i];
                 nums[i]=nums[j];
                 nums[j]=temp;
             }   
            }
        }
        return nums;
    }
}