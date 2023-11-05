// 1535. Find the Winner of an Array Game
// ======================================

class Solution {
    public int getWinner(int[] arr, int k) {
        int cur = arr[0], win = 0;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > cur) {
                cur = arr[i];
                win = 0;
            }
            if (++win == k) break;
        }
        return cur;
    }
}