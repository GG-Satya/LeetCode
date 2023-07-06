// 209. Minimum Size Subarray Sum
// ==============================

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                int subarrayLen = right - left + 1;
                minLen = Math.min(minLen, subarrayLen);
                sum -= nums[left++];
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
