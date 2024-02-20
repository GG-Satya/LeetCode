// 268. Missing Number
// ===================

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length, sum = 0;
        for(int num : nums) sum += num;
        int eSum = (n * (n+1)) / 2;
        return eSum-sum;
    }
}