class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
      Map<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, -1); // Handle the case where the subarray starts from index 0
        int prefixSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int remainder = prefixSum % k;
            
            if (remainder < 0) {
                remainder += k; // Handle negative remainders
            }
            
            if (remainderMap.containsKey(remainder)) {
                if (i - remainderMap.get(remainder) > 1) {
                    return true;
                }
            } else {
                remainderMap.put(remainder, i);
            }
        }
        return false;   
    }
}