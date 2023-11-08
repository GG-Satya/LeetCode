// 2849. Determine if a Cell Is Reachable at a Given Time
// ======================================================

class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int xdiff = Math.abs(sx - fx), ydiff = Math.abs(sy - fy);
        if(xdiff == 0 && ydiff == 0 && t == 1) return false;
        return Math.max(xdiff, ydiff) <= t;
    }
}