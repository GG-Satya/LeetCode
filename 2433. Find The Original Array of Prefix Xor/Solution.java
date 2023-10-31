// 2433. Find The Original Array of Prefix Xor
// ===========================================

class Solution {
    public int[] findArray(int[] pref) {
        for(int i = pref.length - 1; i > 0; --i)
        pref[i] ^= pref[i - 1];
        return pref;
    }
}