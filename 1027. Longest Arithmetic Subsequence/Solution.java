// 1027. Longest Arithmetic Subsequence
// ====================================

class Solution {
    public int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return n;
        }

        // Initialize a HashMap of HashMaps to store the longest arithmetic subsequence lengths
        Map<Integer, Integer>[] dp = new HashMap[n];
        for (int i = 0; i < n; i++) {
            dp[i] = new HashMap<>();
        }

        int maxLength = 0;

        // Iterate over each element in the array
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                // Calculate the difference between the current element and the previous element
                int diff = nums[i] - nums[j];

                // Get the longest arithmetic subsequence length ending at index j with the difference 'diff'
                int length = dp[j].getOrDefault(diff, 1) + 1;

                // Update the longest arithmetic subsequence length ending at index i with the difference 'diff'
                dp[i].put(diff, length);

                // Update the overall maximum length
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }
}