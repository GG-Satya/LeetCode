// 520. Detect Capital
// ===================

// Method - 01 (1 ms)
// -----------

class Solution {

    public boolean detectCapitalUse(String word) {

        int numUpper = 0;

        for (int i=0;i<word.length();i++)
            if (Character.isUpperCase(word.charAt(i))) numUpper++;

        if (numUpper == 1) return Character.isUpperCase(word.charAt(0));

        return numUpper == 0 || numUpper == word.length();
    }
}

// Method - 02 (7 ms)
// -----------

class Solution {

    public boolean detectCapitalUse(String word) {

        return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
    }
}
