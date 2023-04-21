// 879. Profitable Schemes
// =======================

class Solution {
    private int mod = (int)1e9 + 7;
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int[][][] dp = new int[group.length + 1][n + 1][minProfit + 1];
        dp[0][0][0] = 1;
        for (int k = 1; k <= group.length; k++) {
            int g = group[k - 1];
            int p = profit[k - 1];
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= minProfit; j++) {
                    dp[k][i][j] = dp[k - 1][i][j];
                    if (i >= g) {
                        dp[k][i][j] = (dp[k][i][j] + dp[k - 1][i - g][Math.max(0, j - p)])%mod;
                    }
                }
            }
        }
        int sum = 0;                                                       
        for(int i = 0; i <= n; i++){
            sum = (sum + dp[group.length][i][minProfit])%mod;
        }
        return sum;
    }
}