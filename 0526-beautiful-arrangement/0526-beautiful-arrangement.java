class Solution {
    public int countArrangement(int n) {
        return count(n,new ArrayList<>());
    }
    public int count(int n,List<Integer>p){
        if(p.size()==n){
            return 1;

        }
        
        
            int res=0;
            for(int i=1;i<=n;i++){
                int len=p.size()+1;
                
                if(p.contains((Integer)i) || (i%len != 0 && len%i != 0)){
                    continue;
                }
                p.add((Integer)i);
                res += count(n,p);
                p.remove((Integer)i);
            }
                    return res;
        

    }
}