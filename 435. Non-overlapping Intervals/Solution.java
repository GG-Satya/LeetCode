// 435. Non-overlapping Intervals
// ==============================

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparingInt(arr -> arr[0]));
        int removalCount = 0;
        int prevEnd = intervals[0][1];
        for(int i=1; i<intervals.length; i++){
            int currStart = intervals[i][0], currEnd = intervals[i][1];
            if(currStart >= prevEnd){
                prevEnd = currEnd;
            }else{
                removalCount++;
                prevEnd = Math.min(currEnd,prevEnd);
            }
        }return removalCount;
    }
}