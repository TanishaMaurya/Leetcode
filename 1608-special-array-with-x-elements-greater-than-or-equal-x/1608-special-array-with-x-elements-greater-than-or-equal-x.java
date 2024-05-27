class Solution {
    public int specialArray(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<=n;i++){
               int c=0;
            for(int p:nums){
                if(i<=p){
                    c++;
                        }
            }
            if(c==i) {
                return c;
            }

        }
        return -1;
       
    }
}

