class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int c=0;
        int s=0;
        for(int i=0;i<nums.length;i++){
            s += nums[i];
            if(s==k){
                c++;
            }
            if(hm.containsKey(s-k)){
                c += hm.get(s-k);
            }
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        return c;
    }
}