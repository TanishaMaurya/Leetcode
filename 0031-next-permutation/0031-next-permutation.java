class Solution {


    public void nextPermutation(int[] nums) {
        int ind=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){

            //reverse the array\
         for(int i=0;i<n/2;i++){
             int t=nums[i];
             nums[i]=nums[n-1-i];
             nums[n-1-i]=t;
         }   
        return;
        }  
        else{
        for(int i=n-1;i>ind;i--){
           if(nums[i]>nums[ind]){
               //swap nums[i] with nums[ind]
               int t=nums[i];
               nums[i]=nums[ind];
               nums[ind]=t;
               break;
           }
        }
        }

        //reverse remaining array
        int s=ind+1;
        int e=n-1;
        while(s<e){
            int t=nums[s];
            nums[s]=nums[e];
            nums[e]=t;
            s++;
            e--;
        }

    }
}