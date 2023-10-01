// 880. Decoded String at Index
// ============================

class Solution {
    public String decodeAtIndex(String s, int k) {
        int i;
        long n = 0;
        for (i = 0; n < k; i++) {
            n = Character.isDigit(s.charAt(i)) ? n * (s.charAt(i) - '0') : n + 1;
        }
        for (i--; i > 0; i--) {
            if (Character.isDigit(s.charAt(i))) {
                n /= s.charAt(i) - '0';
                k %= n;
            }
            else {
                if (k % n == 0) {
                    break;
                }
                n--;
            }
        }
        return Character.toString(s.charAt(i));
    }
}