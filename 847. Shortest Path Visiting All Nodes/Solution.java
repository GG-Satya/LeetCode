// 847. Shortest Path Visiting All Nodes
// =====================================


class Solution {
    public int shortestPathLength(int[][] graph) {
        int n = graph.length;
        int targetMask = (1 << n) - 1;
        int[][] dp = new int[n][1 << n];
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            dp[i][1 << i] = 0;
            queue.offer(new int[]{i, 1 << i});
        }

        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int currentNode = node[0];
            int currentMask = node[1];

            for (int neighbor : graph[currentNode]) {
                int newMask = currentMask | (1 << neighbor);

                if (dp[neighbor][newMask] == 0) {
                    dp[neighbor][newMask] = dp[currentNode][currentMask] + 1;
                    queue.offer(new int[]{neighbor, newMask});
                }

                if (newMask == targetMask) {
                    return dp[neighbor][newMask];
                }
            }
        }

        return 0; // This should not happen for a connected graph.

    }
}