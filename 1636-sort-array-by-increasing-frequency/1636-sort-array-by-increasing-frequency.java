class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }
            else{
                hm.put(nums[i],hm.get(nums[i])+1);
            }
        }
        
        Integer[] newarr=new Integer[nums.length];
        for(int i=0;i<n;i++){
            newarr[i]=nums[i];
        }
        
        Arrays.sort(newarr,(a,b)->{
            if(hm.get(a).equals(hm.get(b))){
                return Integer.compare(b,a);
            }
            return Integer.compare(hm.get(a),hm.get(b));
        });
        
        for(int i=0;i<n;i++){
            nums[i]=newarr[i];
        }
        return nums;
    }
}