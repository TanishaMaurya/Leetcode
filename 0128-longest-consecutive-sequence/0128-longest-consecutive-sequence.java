class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int len=nums.length;
       int currs=0,s=0;
       for(int nn:nums){
           hm.put(nn,hm.getOrDefault(nn,0)+1);
       }
       int n=0;
       for(int i=0;i<len;i++){
           n=nums[i];
           currs=0;
           if(!(hm.containsKey(nums[i]-1))){
               currs++;
               while(hm.containsKey(n+1)){
                   currs++;
                   n++;
               }
           }
           s=Math.max(s,currs);
       }
      return s;
    }

}