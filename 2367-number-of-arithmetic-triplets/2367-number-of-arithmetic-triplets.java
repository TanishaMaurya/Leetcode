class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int c=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            int a=nums[i]+diff;
            int b=a+diff;
            if(hm.containsKey(a) && hm.containsKey(b)){
                c++;
            }
        }
        return c;
    }
}