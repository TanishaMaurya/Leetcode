class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//       int n=nums2.length;
//       int arr[]=new int[n];
//       Stack<Integer> s=new Stack();
//       for(int i=0;i<n;i++){
//           while(!s.isEmpty() && nums2[s.peek()]<nums2[i]){
//               arr[s.pop()]=nums2[i];

//           }
//           s.push(i);
//       }
//       while(!s.isEmpty()){
//           arr[s.pop()] = -1;
//       }
//       int a[]=new int[nums1.length];
//       Map<Integer,Integer> h=new HashMap<>();
//       for(int i=0;i<n;i++){
//           h.put(nums2[i],arr[i]);
//       }
//       for(int i=0;i<nums1.length;i++){
//           a[i]=h.get(nums1[i]);
//       }
//       return a;
        
        
        int n=nums2.length;
        int arr[]=new int[n];
        Stack<Integer> s =new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && nums2[s.peek()]<nums2[i]){
                arr[s.pop()]=nums2[i];
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            arr[s.pop()]=-1;
        }
        int a[]=new int[nums1.length];
        Map<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<n;i++){
            h.put(nums2[i],arr[i]);
        }
        for(int i=0;i<nums1.length;i++){
            a[i]=h.get(nums1[i]);
        }
        return a;
          }
}