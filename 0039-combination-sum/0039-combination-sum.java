class Solution {

  public void combination(int ind,int[] a,int t,List<List<Integer>> res,List<Integer> l){
     if(ind==a.length){
         if( t==0)
         res.add(new ArrayList<>(l));
         
         return;
     }
     if(a[ind] <= t){
         l.add(a[ind]);
         combination(ind,a,t-a[ind],res,l);
         l.remove(l.size()-1);
     }
     combination(ind+1,a,t,res,l);

  }


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        combination(0,candidates,target,res,new ArrayList<>());
        return res;
    }
}