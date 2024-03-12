class Solution {
    public int[] searchRange(int[] nums, int target) {
        
int f=search(nums,target,true);
int l=search(nums,target,false);
int o[]={-1,-1};
o[0]=f;
o[1]=l;
return o;
 
    }
    public int search(int[] nums,int target,boolean findstart) {
        int a=-1;
        int l=0,r=nums.length-1;
        while(l<=r){
            int m=(l+r)/2;

            if(nums[m] > target){
                r=m-1;
            }else if(nums[m] <target){
                l=m+1;
            }else{
                a=m;
         if(findstart){
                r=m-1;
               }else{
              l=m+1;
               }
            }
        }
        return a;
    }
}