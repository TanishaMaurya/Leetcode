class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        ArrayList<Integer[]> storePairs = new ArrayList<>();
        
        for (int i = 0; i < nums.length; ++i) {
            String number = Integer.toString(nums[i]);
            StringBuilder formed = new StringBuilder();
            
            for (int j = 0; j < number.length(); ++j) {
                formed.append(mapping[number.charAt(j) - '0']);
            }
            
            int mappedValue = Integer.parseInt(formed.toString());
            storePairs.add(new Integer[]{mappedValue, i});
        }
        
        Collections.sort(storePairs, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[0].compareTo(o2[0]);
            }
        });
        
        int[] ans = new int[nums.length];
        for (int i = 0; i < storePairs.size(); ++i) {
            ans[i] = nums[storePairs.get(i)[1]];
        }
        
        return ans;
    }
}
