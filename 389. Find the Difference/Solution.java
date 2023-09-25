// 389. Find the Difference
// ========================


class Solution {
    public char findTheDifference(String s, String t) {

        // Initialize HashMaps to store character frequencies
        Map<Character, Integer> sFreq = new HashMap<>();
        Map<Character, Integer> tFreq = new HashMap<>();

        // Count character frequencies in string s
        for (char ch : s.toCharArray()) {
            sFreq.put(ch, sFreq.getOrDefault(ch, 0) + 1);
        }

        // Count character frequencies in string t
        for (char ch : t.toCharArray()) {
            tFreq.put(ch, tFreq.getOrDefault(ch, 0) + 1);
        }

        // Compare the frequencies of characters in s and t
        for (char ch : tFreq.keySet()) {
            if (!sFreq.containsKey(ch) || tFreq.get(ch) > sFreq.get(ch)) {
                return ch;
            }
        }

        // Return a placeholder character (you can handle this case as needed)
        return '\0';
    }
}


class Solution {
    public char findTheDifference(String s, String t) {
        char c = 0;
        for(char cs : s.toCharArray()) c ^= cs;
        for(char ct : t.toCharArray()) c ^= ct;
        return c;
    }
}