// 1420. Build Array Where You Can Find The Maximum Exactly K Comparisons
// ======================================================================

class Solution {
    static final int MOD = 1000000007;

    public int numOfArrays(int n, int m, int k) {
       int[][][] dp = new int[n + 1][m + 1][k + 1];

        // Base case
        for (int j = 1; j <= m; j++) {
            dp[1][j][1] = 1;
        }

        // Dynamic programming
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                for (int kk = 1; kk <= k; kk++) {
                    for (int jp = 1; jp < j; jp++) {
                        dp[i][j][kk] = (dp[i][j][kk] + dp[i - 1][jp][kk - 1]) % MOD;
                    }
                    dp[i][j][kk] = (int) ((dp[i][j][kk] + (long) dp[i - 1][j][kk] * j) % MOD);
                }
            }
        }

        // Sum up the result for all possible maximum values in the array
        int result = 0;
        for (int j = 1; j <= m; j++) {
            result = (result + dp[n][j][k]) % MOD;
        }

        return result;
    }
}