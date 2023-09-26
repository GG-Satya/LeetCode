// 316. Remove Duplicate Letters
// =============================

class Solution {
    public String removeDuplicateLetters(String s) {

        int[] lastIndex = new int[26]; // Store the last index of each character in the string
        boolean[] used = new boolean[26]; // Keep track of characters in the result

        Stack<Character> stack = new Stack<>();

        // Populate lastIndex with the last index of each character in s
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // If the character is already in the result or if it's smaller than the top of the stack and
            // the top of the stack will appear later in the string, pop it from the stack.
            while (!stack.isEmpty() && !used[currentChar - 'a'] && currentChar < stack.peek() && lastIndex[stack.peek() - 'a'] > i) {
                used[stack.pop() - 'a'] = false;
            }

            // Add the current character to the stack and mark it as used
            if (!used[currentChar - 'a']) {
                stack.push(currentChar);
                used[currentChar - 'a'] = true;
            }
        }

        // Build the result string from the stack
        StringBuilder result = new StringBuilder();

        for (Character c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}