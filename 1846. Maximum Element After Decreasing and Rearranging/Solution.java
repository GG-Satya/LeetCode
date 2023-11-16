// 1846. Maximum Element After Decreasing and Rearranging
// ======================================================

class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int pre = 0;
        for (int a: arr)
            pre = Math.min(pre + 1, a);
        return pre;
    }
}