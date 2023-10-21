// 1425. Constrained Subsequence Sum
// =================================

class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
        int res = nums[0];
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < nums.length; ++i) {
            nums[i] += !q.isEmpty() ? q.peek() : 0;
            res = Math.max(res, nums[i]);
            while (!q.isEmpty() && nums[i] > q.peekLast())
                q.pollLast();
            if (nums[i] > 0)
                q.offer(nums[i]);
            if (i >= k && !q.isEmpty() && q.peek() == nums[i - k])
                q.poll();
        }
        return res;
    }
}