class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        sumcom(ans,k,n,1,new ArrayList<>());
        return ans;
    }

public void sumcom(List<List<Integer>> ans,int k,int n,int i,List<Integer> ds){
    if(n==0 && k==0){
        ans.add(new ArrayList<>(ds));
    }
    if(i>n || k==0 || i==10){
        return;
    }
    ds.add(i);
    sumcom(ans,k-1,n-i,i+1,ds);
    ds.remove(ds.size()-1);

    sumcom(ans,k,n,i+1,ds);
}

}