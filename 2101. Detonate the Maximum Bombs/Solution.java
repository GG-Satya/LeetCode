// 2101. Detonate the Maximum Bombs
// ================================

class Solution {
    public int maximumDetonation(int[][] bombs) {
        int ans = 0;
        for (int i = 0; i < bombs.length; i++) 
            ans = Math.max(ans, dfs(i, new boolean[bombs.length], bombs));
        return ans;
    }

    private int dfs(int idx, boolean[] v, int[][] bombs) {
        int count = 0;
        v[idx] = true;
        for (int i = 0; i < bombs.length; i++)
            if (!v[i] && inRange(bombs[idx], bombs[i]))
                count += dfs(i, v, bombs);
        return 1 + count;
    }

    private boolean inRange(int[] a, int[] b) {
        long dx = a[0] - b[0], dy = a[1] - b[1], r = a[2];
        return dx * dx + dy * dy <= r * r;
  
    }
}