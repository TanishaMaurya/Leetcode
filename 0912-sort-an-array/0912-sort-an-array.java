class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        int l=0,r=n-1;
   
     sorted(l,r,nums);
        return nums;
    }
    public void sorted(int l,int r,int nums[]){
        if(l<r){
             int m=l+(r-l)/2;
            sorted(l,m,nums);
            sorted(m+1,r,nums);
            mergesort(l,r,nums,m);
        }
    }
    
    
    private void mergesort(int l,int r,int []nums,int m){
        int n1=m-l+1;
        int n2=r-m;
        int []l1=new int[n1];
        int []l2=new int[n2];
        for(int i=0;i<n1;i++){
            l1[i]=nums[i+l];
        }
        for(int j=0;j<n2;j++){
            l2[j]=nums[m+1+j];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(l1[i]<=l2[j]){
                nums[k++]=l1[i++];
            }else{
                nums[k++]=l2[j++];
            }
        }
        while(i<n1){
            nums[k++]=l1[i++];
        }
        while(j<n2){
            nums[k++]=l2[j++];
        }
    }
}