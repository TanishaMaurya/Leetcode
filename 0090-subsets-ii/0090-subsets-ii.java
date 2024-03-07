class Solution {

  public static void subset(int ind,int[] a,List<Integer>ds,List<List<Integer>>ans){
      ans.add(new ArrayList<>(ds));
      for(int i=ind;i<a.length;i++){
          if(i != ind && a[i] == a[i-1])continue;
          ds.add(a[i]);
          subset(i+1,a,ds,ans);
          ds.remove(ds.size()-1);
      }
  }


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l=new ArrayList<>();
        subset(0,nums,new ArrayList<>(),l);
        return l;
    }
}