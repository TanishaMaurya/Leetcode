class Solution {
  int[] res, count; ArrayList<HashSet<Integer>> tree;int nn;
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        tree=new ArrayList<HashSet<Integer>>();
        res=new int[n];
        count=new int[n];
       nn=n;
        for(int i=0;i<n;++i){
            tree.add(new HashSet<Integer>());
        }
        for(int[] e:edges){
          tree.get(e[0]).add(e[1]);
          tree.get(e[1]).add(e[0]);
        }
        dfs(0,new HashSet<Integer>());
        dfs2(0,new HashSet<Integer>());
        return res;
    }
    public void dfs(int root,HashSet<Integer> seen){
        seen.add(root);
        for(int i:tree.get(root)){
            if(!seen.contains(i)){
                dfs(i,seen);
                count[root] +=count[i];
                
                res[root] +=res[i]+count[i];
            }

        }
        count[root]++;
    }

    public void dfs2(int root,HashSet<Integer> seen){
        seen.add(root);
        for(int i:tree.get(root)){
            if(!seen.contains(i)){
                res[i]=res[root]-count[i]+nn-count[i];
                dfs2(i,seen);
            }
            }
    }
}