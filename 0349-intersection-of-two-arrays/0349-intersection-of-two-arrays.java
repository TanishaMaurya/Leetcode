class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
        
       HashSet<Integer>s=new HashSet<>();
       ArrayList<Integer> a=new ArrayList<>();
       for(int i=0;i<n1;i++){
           s.add(nums1[i]);
       }
       for(int i=0;i<n2;i++){
           if(s.contains(nums2[i])){
               a.add(nums2[i]);
               s.remove(nums2[i]);
           }
       }
       int[] arr=new int[a.size()];
       for(int i=0;i<a.size();i++){
           arr[i]=a.get(i);
       }
       return arr;
    }
}