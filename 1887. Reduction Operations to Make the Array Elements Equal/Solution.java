// 1887. Reduction Operations to Make the Array Elements Equal
// ===========================================================

class Solution {
    public int reductionOperations(int[] nums) {
        int res = 0, size = nums.length;
        Arrays.sort(nums);
        for (int j = size - 1; j > 0; --j)
            if (nums[j - 1] != nums[j])
                res += size - j;
        return res;
    }
}