// 1218. Longest Arithmetic Subsequence of Given Difference
// ========================================================

class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer,Integer> dp = new HashMap<>();
        int ans = 0;
        for(int num : arr){
            int freq = dp.getOrDefault(num-difference,0);
            dp.put(num,freq+1);
            ans = Math.max(ans,dp.get(num));
        }
        return ans;
    }
}