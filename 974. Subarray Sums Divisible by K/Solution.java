// 974. Subarray Sums Divisible by K
// =================================

class Solution {

    public int subarraysDivByK(int[] nums, int k) {

        int[] count = new int[k];

        count[0] = 1;

        int prefix = 0, res = 0;

        for (int a : nums) {

            prefix = (prefix + a % k + k) % k;

            res += count[prefix]++;
        }
        return res;
    }
}