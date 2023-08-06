// 920. Number of Music Playlists
// ==============================

class Solution {
    long mod = (long)1e9 + 7;
    public int numMusicPlaylists(int n, int goal, int k) {
        long[][] dp = new long[n + 1][goal + 1];
        for (int i = k + 1; i <= n; ++i)
            for (int j = i; j <= goal; ++j)
                if ((i == j) || (i == k + 1))
                    dp[i][j] = factorial(i);
                else
                    dp[i][j] = (dp[i - 1][j - 1] * i + dp[i][j - 1] * (i - k))  % mod;
        return (int) dp[n][goal];
        }

    private long factorial(int n) {
        return n > 0 ? factorial(n - 1) * n % mod : 1;
    }
}