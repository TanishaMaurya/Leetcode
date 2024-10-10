class Solution {
    public boolean containsDuplicate(int[] nums) {
    HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
           hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(HashMap.Entry<Integer,Integer> h: hm.entrySet()){
            if(h.getValue()!=1){
                return true;
            }
        }
        return false;
    }
}