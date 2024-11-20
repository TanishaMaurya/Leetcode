class Solution {
    public int majorityElement(int[] nums) {
    HashMap<Integer,Integer> hm=new HashMap();
        int n=nums.length;
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int ans=-1;
        for(Map.Entry<Integer,Integer> entry:hm.entrySet() ){
            if(entry.getValue()>(n/2)){
                ans=entry.getKey();
            }
        }
        return ans;
    }
}