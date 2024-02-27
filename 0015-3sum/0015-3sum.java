class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> a=new ArrayList<>();
        Set<List<Integer>> s=new HashSet<>();
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;

            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];

                if(sum==0){
                    List<Integer> l=new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    s.add(l);
                    j++;
                    k--;
                }
                else if (sum>0){
                    k--;
                }else if(sum<0){
                    j++;
                }
            }
        }
        for(List<Integer> x:s){
            a.add(x);
        }
        return a;

    }
}