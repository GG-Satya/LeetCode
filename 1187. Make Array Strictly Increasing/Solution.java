// 1187. Make Array Strictly Increasing
// ====================================

class Solution {
    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.stream(arr2).boxed().toList());
        int[] dp = new int[arr2.length+1];
        dp[0]=-1;
        int INF = (int)2e9;
        for (int i = 0; i < arr1.length; i++){
            for (int j = arr2.length; j >= 0; j--){
                int a = arr1[i] > dp[j]? arr1[i] : INF; // option arr1 - don't swap
                Integer b = set.higher(j==0?INF:dp[j-1]); // option arr2 - swap
                dp[j]=Math.min(a, b==null?INF:b); // take the min of arr1 and arr2
            }
        }
        for (int i = 0; i <= arr2.length; i++) if (dp[i] != INF){
            return i;
        }
        return -1;
    }
}