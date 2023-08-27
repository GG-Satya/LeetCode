// 646. Maximum Length of Pair Chain
// =================================

class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a,b) -> a[1] - b[1]);
        int count = 0, i = 0, n = pairs.length;
        while (i < n) {
            count++;
            int curEnd = pairs[i][1];
            while (i < n && pairs[i][0] <= curEnd) i++;
        }
    return count;
    }
}