class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
        int i=0,j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
      
        ArrayList<Integer> a=new ArrayList<>();
        while(i<n1 && j<n2){
            if(nums1[i]==nums2[j]){

                a.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int b[]=new int[a.size()];
        int k=0;
        for(int p:a){
            b[k++]=p;
        }
      return b;
    }
}