class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
 Map<Integer,Integer>mp=new HashMap<>();
        int []v=new int [2];
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(target-nums[i])){
                v[0]=mp.get(target-nums[i]);
                v[1]=i;
                return v;
            }
            mp.put(nums[i],i);
        }
        return v;
    }
}

