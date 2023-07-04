// 137. Single Number II
// =====================

class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0;  // Represents the bits that appeared once
        int twos = 0;  // Represents the bits that appeared twice

        for (int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }

        return ones;
    }
}