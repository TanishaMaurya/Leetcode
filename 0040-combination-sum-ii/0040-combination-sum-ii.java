class Solution {
    
    public void combination(int ind,int[] a,int t,List<List<Integer>> res,List<Integer> l){
        if(t<0) return;
        
        if(t==0){
                res.add(new ArrayList<>(l));
                return;
            }
      for(int i=ind;i<a.length;i++){
       if(i>ind &&    a[i]==a[i-1]) continue;
          
          else if(a[i]>t) break;
          
          else{
            l.add(a[i]);
            combination(i+1,a,t-a[i],res,l);
            l.remove(l.size()-1);
          } 
        }
     
    }
    
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        combination(0,candidates,target,res,new ArrayList<>());
        return res;
    }
}