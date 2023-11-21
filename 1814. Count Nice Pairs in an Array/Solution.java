// 1814. Count Nice Pairs in an Array
// ==================================

class Solution {
    public int countNicePairs(int[] nums) {
        int res = 0, mod = (int)1e9 + 7;
        Map<Integer, Integer> count = new HashMap<>();;
        for (int a : nums) {
            int b = rev(a), v = count.getOrDefault(a - b, 0);
            count.put(a - b, v + 1);
            res = (res + v) % mod;
        }
        return res;
    }

    public int rev(int a) {
        int b = 0;
        while (a > 0) {
            b = b * 10 + (a % 10);
            a /= 10;
        }
        return b;
    }
}