class Solution {
    public int searchInsert(int[] nums, int target) {
     int n=nums.length,c=0;
     for(int i=0;i<n;i++){
         if(target>nums[i]){
             c++;
         }
     }   
     return c;
    }
}