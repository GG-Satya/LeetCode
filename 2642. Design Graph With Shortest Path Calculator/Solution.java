// 2642. Design Graph With Shortest Path Calculator
// ================================================

class Graph {
    List<List<Pair<Integer, Integer>>> adj_list;
    public Graph(int n, int[][] edges) {
        adj_list = new ArrayList<>();
    for (int i = 0; i < n; i++)
        adj_list.add(new ArrayList<>());
    for (int[] e : edges)
        adj_list.get(e[0]).add(new Pair<>(e[1], e[2]));
    }
    
    public void addEdge(int[] edge) {
        adj_list.get(edge[0]).add(new Pair<>(edge[1], edge[2]));
    }
    
    public int shortestPath(int node1, int node2) {
        int n = adj_list.size();
    PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.getKey()));
    int[] dist = new int[n];
    Arrays.fill(dist, Integer.MAX_VALUE);
    dist[node1] = 0;
    pq.offer(new Pair<>(0, node1));

    while (!pq.isEmpty()) {
        var pair = pq.poll();
        int d = pair.getKey(), node = pair.getValue();
        if (node == node2) return d;
        if (d > dist[node]) continue;
        for (Pair<Integer, Integer> neighbor : adj_list.get(node)) {
            int new_dist = d + neighbor.getValue();
            if (new_dist < dist[neighbor.getKey()]) {
                dist[neighbor.getKey()] = new_dist;
                pq.offer(new Pair<>(new_dist, neighbor.getKey()));
            }
        }
    }
    return -1;
    }
}

/**
 * Your Graph object will be instantiated and called as such:
 * Graph obj = new Graph(n, edges);
 * obj.addEdge(edge);
 * int param_2 = obj.shortestPath(node1,node2);
 */