// 926. Flip String to Monotone Increasing
// =======================================

class Solution {

    public int minFlipsMonoIncr(String s) {

    int f0 = 0, f1 = 0;

    for (int i = 0; i < s.length(); ++i) {

        f0 += s.charAt(i) - '0';

        f1 = Math.min(f0, f1 + 1 - (s.charAt(i) - '0'));
    }
    return f1;
    }
}