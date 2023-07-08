// 2551. Put Marbles in Bags
// =========================

class Solution {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length - 1;
        long arr[] = new long[n], res = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = weights[i] + weights[i + 1];
        }
        Arrays.sort(arr);
        for (int i = 0; i < k - 1; i++) {
            res += arr[n - 1 - i] - arr[i];
        }
        return res;
    }
}