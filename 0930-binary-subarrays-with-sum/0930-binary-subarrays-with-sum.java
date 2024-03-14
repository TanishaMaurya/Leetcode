class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       int res=0;
        int ps=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            ps += nums[i];
            res += hm.getOrDefault(ps-goal,0);
            hm.put(ps,hm.getOrDefault(ps,0)+1);
        }
        return res;
    }
}