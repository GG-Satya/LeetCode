// 458. Poor Pigs
// ==============

class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int maxTime = minutesToTest / minutesToDie + 1, reqPigs = 0;
        while (Math.pow(maxTime, reqPigs) < buckets)reqPigs++;
        return reqPigs;
    }
}