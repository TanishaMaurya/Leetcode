class Solution {
    
        public int numberOfSubarrays(int[] nums, int k) {
        
        return atMostK(nums, k) - atMostK(nums, k-1);
    }
    
    private int atMostK(int[] nums, int k) {
        int i = 0, res = 0;
        //sliding window
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] % 2 != 0) {
                k--;
            }
            //k goes negative we will increment i until k becomes 0.
            while (k < 0) {
                if (nums[i] % 2 != 0) {
                    k++;
                }
                i++;
            }
            res += j - i + 1;  //sliding window
        }
        return res;   
    }
}