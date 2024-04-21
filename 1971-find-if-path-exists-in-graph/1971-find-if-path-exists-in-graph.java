class Solution {
      public boolean validPath(int n, int[][] edges, int source, int destination) {
        DSU dsu = new DSU(n);

        for(int edge[] : edges){
            dsu.union(edge[0], edge[1]);
        }

        return dsu.findParent(source) == dsu.findParent(destination);
    }

    class DSU{
        int parents[];
        int ranks[];

        public DSU(int n){
            parents = new int[n];
            ranks = new int[n];

            for(int i = 0; i < n; i++){
                parents[i] = i;
                ranks[i] = 1;
            }
        }

        public int findParent(int node){
            if(parents[node] == node){
                return node;
            }

            return parents[node] = findParent(parents[node]);
        }

        public void union(int u, int v){
            int p_u = findParent(u);
            int p_v = findParent(v);

            if(p_u == p_v) return;

            if(ranks[p_u] <= ranks[p_v]){
                parents[p_u] = parents[p_v];
                ranks[p_v] += ranks[p_u];
            } else {
                parents[p_v] = parents[p_u];
                ranks[p_u] += ranks[p_v];
            }
        }
    }
}