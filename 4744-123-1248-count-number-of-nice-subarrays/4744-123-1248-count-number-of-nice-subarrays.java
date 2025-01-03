class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k) {
        int l = 0, r = 0, sum = 0, count = 0;
        while (r < nums.length) {
            sum += (nums[r] % 2); // Increment sum for odd numbers
            while (sum > k) {    // Shrink the window if sum exceeds k
                sum -= (nums[l] % 2);
                l++;
            }
            count += (r - l + 1); // Count valid subarrays
            r++;
        }
        return count;
    }
}
