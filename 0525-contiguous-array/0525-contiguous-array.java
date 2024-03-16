class Solution {
    public int findMaxLength(int[] nums) {
        int maxs=0,curs=0;
        HashMap<Integer,Integer> hm =new HashMap<>();
        hm.put(0,-1);
        for(int i=0;i<nums.length;i++){
            curs += nums[i]==0 ? -1 :1;
            
            if(hm.containsKey(curs)){
                maxs=Math.max(maxs,i-hm.get(curs));
            }else{
                hm.put(curs,i);
            }
        }
        return maxs;
    }
}

