// 81. Search in Rotated Sorted Array II
// =====================================

class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while(start<=end){
            if(nums[start++] == target || nums[end--] == target)return true;
        }
        return false;
    }
}