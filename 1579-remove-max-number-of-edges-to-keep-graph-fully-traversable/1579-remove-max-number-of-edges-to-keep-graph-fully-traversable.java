class Solution {

    // Initializes the graph with each node as its own parent
    public void connectNode(int graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = i;
        }
    }

    // Finds the root of the node with path compression
    public int find(int v, int edges[]) {
        if (v == edges[v]) {
            return v;
        }
        return edges[v] = find(edges[v], edges);
    }

    // Unites two subsets into a single subset
    public void union(int a, int b, int edges[]) {
        int pa = find(a, edges);
        int pb = find(b, edges);
        if (pa != pb) {
            edges[pa] = pb;
        }
    }

    // Calculates the maximum number of edges that can be removed
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        int[] common = new int[n + 1];
        connectNode(common);

        int[] bob = new int[n + 1];
        int[] alice = new int[n + 1];
        connectNode(bob);
        connectNode(alice);

        int removedEdges = 0;

        // Process type 3 edges
        for (int[] edge : edges) {
            if (edge[0] == 3) {
                if (find(edge[1], common) != find(edge[2], common)) {
                    union(edge[1], edge[2], common);
                    union(edge[1], edge[2], alice);
                    union(edge[1], edge[2], bob);
                } else {
                    removedEdges++;
                }
            }
        }

        // Process type 1 and type 2 edges
        for (int[] edge : edges) {
            int u = edge[1], v = edge[2];
            if (edge[0] == 1) {
                if (find(u, alice) != find(v, alice)) {
                    union(u, v, alice);
                } else {
                    removedEdges++;
                }
            } else if (edge[0] == 2) {
                if (find(u, bob) != find(v, bob)) {
                    union(u, v, bob);
                } else {
                    removedEdges++;
                }
            }
        }

        int aliceRoot = find(1, alice);
        int bobRoot = find(1, bob);

        // Check if all nodes are connected for both Alice and Bob
        for (int i = 2; i <= n; i++) {
            if (find(i, alice) != aliceRoot || find(i, bob) != bobRoot) {
                return -1;
            }
        }

        return removedEdges;
    }
}
