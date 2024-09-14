class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        // Arrays.sort(nums);
        int maxi=0,ans=0,curr=0;
       for(int num:nums){
           if(maxi<num){
               maxi=num;
               ans=curr=0;
           }
           if(maxi==num){
               curr++;
           }else{
               curr=0;
           }
           ans=Math.max(ans,curr);
       }
        return ans;
    }
}