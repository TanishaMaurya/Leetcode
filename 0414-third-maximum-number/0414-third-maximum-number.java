class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
    Arrays.sort(nums);
     
        int ans=nums[n-1];
        int c=1,i=n-1;
        while(c<3 && i>0){
         if(nums[i]!=nums[i-1]){
                c++;
            }
            if(c==3){
                return nums[i-1];
            }
            i--;
        }
        return ans;
    }
}