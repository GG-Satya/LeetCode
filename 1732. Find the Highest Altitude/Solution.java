// 1732. Find the Highest Altitude
// ===============================

class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0,curr = 0;
        for(int i=0; i<gain.length; i++){
            curr += gain[i];
            if(curr > max) max = curr;
        }
        return max;
    }
}