// 1838. Frequency of the Most Frequent Element
// ============================================

class Solution {
    public int maxFrequency(int[] nums, int k) {
        int res = 1, i = 0, j;
        long sum = 0;
        Arrays.sort(nums);
        for (j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum + k < (long)nums[j] * (j - i + 1)) {
                sum -= nums[i++];
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}