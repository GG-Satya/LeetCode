// 342. Power of Four
// ==================

class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }

        // Check if it is a power of two
        if ((n & (n - 1)) != 0) {
            return false;
        }

        // Check if the only set bit is at an even position
        return ((int)(Math.log10(n) / Math.log10(2)) & 1) == 0;
    }
}