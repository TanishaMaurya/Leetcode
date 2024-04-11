class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++){
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    l.add(1);
                    continue;
                }
                l.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
            }
            ans.add(l);
        }
        return ans;
    }
}