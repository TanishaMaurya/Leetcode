class Solution {
    public int maxFrequencyElements(int[] nums) {
       Map<Integer,Integer> hm=new HashMap<>();
        int max=0;
       for(int i=0;i<nums.length;i++){
           if(hm.containsKey(nums[i])){
              
             hm.put(nums[i], hm.get(nums[i]) + 1);
           }else {
               hm.put(nums[i],1);
           }
                      if(hm.containsKey(nums[i]) &&   hm.get(nums[i])>max){
                          max=hm.get(nums[i]);
                      } 
       } 
                      int c=0;
                      List<Integer> l=new ArrayList<>(hm.values());
                      for(int num:l){
                          if(num==max){
                              c += num;
                          }
                      }
                      return c;
                      
    }
}