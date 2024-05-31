class Solution {
    public int[] singleNumber(int[] nums) {
        int n=nums.length;
        int xor=0;
        for(int nn:nums){
            xor ^= nn;
        }
     int bit = 1;
        for (int i = 0; i < 32; i++) {
            int set_bit = 1 << i;
            if ((xor & set_bit) != 0) {
                bit = set_bit;
                break;
            }
        }
        int b1=0,b2=0;
        for(int i=0;i<n;i++){
            if((nums[i] & bit)!=0){
                b1 ^= nums[i];
            }
            else{
                b2 ^=nums[i];
            }
        }
        int b[]=new int[]{b1,b2};
        return b;
    }
} 