class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        //b:begin ,e:end ,j:jump ,f:furthest
       int b=0,e=0,f=0,j=0;
        for(int i=0;i<n-1;i++){
            f=Math.max(f,i+nums[i]);
            if(i==e){
                j++;
                e=f;
            }
        }
        return j;
    }
}