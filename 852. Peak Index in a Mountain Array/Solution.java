// 852. Peak Index in a Mountain Array
// ===================================

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int index = 0;
        while(arr[index] < arr[index+1]){ index++;}
        return index;
    }
}