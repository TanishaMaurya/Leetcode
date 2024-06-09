class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        int prefixsum=0;
        int c=0,rem=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<n;i++){
            prefixsum +=nums[i];
            rem=prefixsum%k;
            if(rem <0){
                rem =rem+k;
            }
            if(hm.containsKey(rem)){
                c += hm.get(rem);
            }
            hm.put(rem,hm.getOrDefault(rem,0)+1);
            
        }
        return c;
    }
}