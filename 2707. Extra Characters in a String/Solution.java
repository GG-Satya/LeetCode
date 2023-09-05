// 2707. Extra Characters in a String
// ==================================

class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        int[] dp = new int[s.length() + 1]; // dp[i] represents the minimum extra characters for s.substring(i)
	    for (int i = s.length() - 1; i >= 0; i--) {
	        dp[i] = dp[i + 1] + 1; // Initialize with the maximum possible value
	        for (String word : dictionary) {
	            if (i + word.length() <= s.length() && s.startsWith(word, i)) {
	                    dp[i] = Math.min(dp[i], dp[i + word.length()]);
	                }
	            }
	        }
	    return dp[0];
    }
}