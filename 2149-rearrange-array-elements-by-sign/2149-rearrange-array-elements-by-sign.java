class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        int n=nums.length;
        int j=0,k=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                a1.add(nums[i]);
            }else{
                a2.add(nums[i]);
            }
        }
        
        int i=0;
        for(i=0;i<n/2;i++){
            nums[i*2]=a1.get(i);
         
            nums[i*2+1]=a2.get(i);
         
        }
        return nums;
    }
}