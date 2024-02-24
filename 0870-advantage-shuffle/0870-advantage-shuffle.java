class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
       int n=nums1.length ;
       PriorityQueue<int[]> pq=new PriorityQueue<>(
           (int[] p1,int[] p2)->{
               return p2[1]-p1[1];           
               }
       );
       for(int i=0;i<n;i++){
           pq.offer(new int[]{i,nums2[i]});
       }
       Arrays.sort(nums1);
       int l=0,r=n-1;
       int[] res=new int[n];
       while(!pq.isEmpty()){
           int []pair=pq.poll();
           int i=pair[0];
           int val=pair[1];
           if(nums1[r]>val){
               res[i]=nums1[r];
               r--;
           }else{
               res[i]=nums1[l];
               l++;
           }
       }
       return res;
          }
}