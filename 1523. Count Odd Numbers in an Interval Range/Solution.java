// 1523. Count Odd Numbers in an Interval Range
// ============================================


// method-1
// --------

class Solution {

    public int countOdds(int low, int high) {

        return (high + 1) / 2 - low / 2;

    }
}

// method-02
// ---------

class Solution {

    public int countOdds(int low, int high) {

        if(low%2==0 && high%2==0)return (high - low)/2;

        else if(low%2!=0 && high%2!=0) return ((high-low)+2)/2;

        else  return ((high-low)+1)/2;
    }
}