// 1493. Longest Subarray of 1's After Deleting One Element
// ========================================================

class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0, j, k = 1, res = 0;
        for (j = 0; j < nums.length; ++j) {
            if (nums[j] == 0) {
                k--;
            }
            while (k < 0) {
                if (nums[i] == 0) {
                    k++;
                }
                i++;
            }
            res = Math.max(res, j - i);
        }
        return res;
    }
}