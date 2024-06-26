class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
         List<Integer> res = new ArrayList<>();

        if(n == 0) return res;
        if(n == 1){
            res.add(0);
            return res;
        }

        List<List<Integer>> adj = new ArrayList<>();
        int[] degree = new int[n];
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<Integer>());
        }

        for(int[] edge : edges){
            degree[edge[0]]++;
            degree[edge[1]]++;

            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        for(int i = 0; i < n; i++){
            if(degree[i] == 1) q.add(i);
        }

        while(n > 2){
            int size = q.size();
            n -= size;

            while(size-->0){
                int v = q.poll();

                for(int i: adj.get(v)){
                    degree[i]--;
                    if(degree[i] == 1) q.add(i);
                }
            }
        }

        res.addAll(q);

        return res;
    
    }
}