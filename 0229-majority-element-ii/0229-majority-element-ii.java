class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> l=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int threshold=n/3;
        for(Map.Entry<Integer,Integer> b:hm.entrySet()){
            int element=b.getKey();
            int count=b.getValue();
            if(count > threshold){
                l.add(element);
            }
        }
        return l;

    }
}