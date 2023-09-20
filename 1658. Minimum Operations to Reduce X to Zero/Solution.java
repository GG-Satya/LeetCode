// 1658. Minimum Operations to Reduce X to Zero
// ============================================


class Solution {
    public int minOperations(int[] nums, int x) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        int target = totalSum - x;
        if (target < 0) {
            return -1;
        }
        
        int left = 0;
        int currentSum = 0;
        int minOperations = Integer.MAX_VALUE;
        
        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];
            
            while (currentSum > target) {
                currentSum -= nums[left];
                left++;
            }
            
            if (currentSum == target) {
                minOperations = Math.min(minOperations, nums.length - (right - left + 1));
            }
        }
        
        return minOperations == Integer.MAX_VALUE ? -1 : minOperations;
    }
}