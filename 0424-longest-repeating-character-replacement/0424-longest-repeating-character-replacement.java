class Solution {
    public int characterReplacement(String s, int k) {
                int[] count = new int[26];
        int maxCount = 0;
        int maxLength = 0;
        int left = 0;        
        int startOfReplacement = 0; // Start index of the substring that needs to be replaced

        for (int right = 0; right < s.length(); right++) {
            maxCount = Math.max(maxCount, ++count[s.charAt(right) - 'A']);

            // If the window size minus the maximum count is greater than k, shrink the window from the left
            if (right - left + 1 - maxCount > k) {
                count[s.charAt(left++) - 'A']--;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}