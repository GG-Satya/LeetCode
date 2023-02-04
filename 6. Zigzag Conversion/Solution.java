// 6. Zigzag Conversion
// ====================

class Solution {

    public String convert(String s, int numRows) {

        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder result = new StringBuilder();

        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {

            for (int j = 0; j + i < s.length(); j += cycleLen) {

                result.append(s.charAt(j + i));

                if (i != 0 && i != numRows - 1 && j + cycleLen - i < s.length()) {

                    result.append(s.charAt(j + cycleLen - i));
                }
            }
        }
        return result.toString();
    }
}
