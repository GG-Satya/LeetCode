// 1877. Minimize Maximum Pair Sum in Array
// ========================================

class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        for(int i =0, j=nums.length-1; i<j ; i++,j--){
            max = Math.max(max, nums[i] + nums[j]);
        }return max;
    }
}