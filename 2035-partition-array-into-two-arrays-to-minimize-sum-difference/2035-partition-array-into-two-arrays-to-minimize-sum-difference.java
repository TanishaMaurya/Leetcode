class Solution {
    
    private int getOnesCount(int n) {
        int k = n, ones = 0;
        while(k > 0) {
            ones += (k & 1);
            k >>= 1;
        }
        return ones;
    }
    
   
    private List<List<Integer>> generateSubsets(int []nums, int start, int end, int offset) {
        List<List<Integer>> subsets = new ArrayList<>();
        
        int n = end - start + 1;
        
        for(int i=0; i <= n; i++) {
            subsets.add(new ArrayList<>());
        }
        
        int size = nums.length;
        int k = (1 << n);
        for(int i = 0; i < k; i++) {
            int currentSum = 0;
            for(int j = n - 1; j >= 0; j--) {
                if(((i >> j) & 1) != 0 && j + offset < size) {
                    currentSum += nums[j + offset];
                }
            }
            int ones = getOnesCount(i);
            
            subsets.get(ones).add(currentSum);
        }
        
        return subsets;
    }

    
    private int[] getBounds(List<Integer> nums, int target) {
        
        int low = 0, high = nums.size() - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums.get(mid) > target) high = mid - 1;
            else low = mid + 1;
        }
        return new int[]{low, high}; // Ceil, Floor element. 
    }
    
    private boolean isValidBound(int bound, int n) {
        return bound >=0 && bound < n;
    }

    
    private int getAbsDifference(List<List<Integer>> leftSubset, List<List<Integer>> rightSubset, int goal, int n) {
        
        
        int maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE;
        
        for(int i=0; i< leftSubset.size(); i++) {
            List<Integer> leftValues = leftSubset.get(i);
            for(int leftValue : leftValues) {
                int target = goal - leftValue;
                int []bound = getBounds(rightSubset.get(n - i), target); 
                
                int m = rightSubset.get(n - i).size();
                
                // For ceil value
                if(isValidBound(bound[0], m)) {
                    minSum = Math.min(minSum, leftValue + rightSubset.get(n - i).get(bound[0]));
                }
            
                // For floor value
                if(isValidBound(bound[1], m)) {
                    maxSum = Math.max(maxSum, leftValue + rightSubset.get(n - i).get(bound[1]));
                }
            }
        }
                
        int result =  Math.abs(maxSum - goal) < Math.abs(goal - minSum)? maxSum : minSum;
        return result;
    }
    
    public int minimumDifference(int[] nums) {
        int target = 0, n = nums.length, sum = 0;
        for(int num : nums) {
            sum += num;
        }
        
        target  = (sum >> 1);
        List<List<Integer>> leftSubset = generateSubsets(nums, 1, (n >> 1), 0);
        List<List<Integer>> rightSubset = generateSubsets(nums, (n >> 1) + 1 , n , (n >> 1));
        
        
        for(List<Integer> rightSubsetList : rightSubset) {
            Collections.sort(rightSubsetList);
        }
        
        int desired = getAbsDifference(leftSubset, rightSubset, target, (n >> 1));
        return Math.abs(sum - 2 * desired);
        
    }
    
}