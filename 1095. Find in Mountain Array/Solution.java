// 1095. Find in Mountain Array
// ============================


/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
      int peakIndex = findPeakIndex(mountainArr);
        
        // Search in the left side of the peak
        int leftIndex = binarySearch(mountainArr, target, 0, peakIndex, true);
        if (leftIndex != -1) {
            return leftIndex;
        }
        
        // Search in the right side of the peak
        int rightIndex = binarySearch(mountainArr, target, peakIndex + 1, mountainArr.length() - 1, false);
        return rightIndex;
    }

    // Function to find the peak index in the mountain array
    private static int findPeakIndex(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }

    // Binary search function
    private static int binarySearch(MountainArray mountainArr, int target, int start, int end, boolean ascending) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = mountainArr.get(mid);

            if (midValue == target) {
                return mid;
            }

            if (ascending) {
                if (midValue < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (midValue > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1; // Element not found
    }
}