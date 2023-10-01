// 456. 132 Pattern
// ================

class Solution {
    public boolean find132pattern(int[] nums) {
       int n = nums.length;
        if (n < 3) {
            return false; // The pattern requires at least three numbers.
        }

        int[] minArray = new int[n];
        minArray[0] = nums[0];

        // Fill the minArray with the minimum values up to the current index.
        for (int i = 1; i < n; i++) {
            minArray[i] = Math.min(minArray[i - 1], nums[i]);
        }

        Stack<Integer> stack = new Stack<>();

        // Iterate from the end to find the 3rd number in the pattern.
        for (int j = n - 1; j >= 0; j--) {
            // Check if the current number is greater than the minimum value.
            if (nums[j] > minArray[j]) {
                // Check if there exists a number in the stack that is less than the current number.
                while (!stack.isEmpty() && stack.peek() <= minArray[j]) {
                    stack.pop();
                }

                // If we found a number in the stack greater than the current minimum,
                // it satisfies the 132 pattern, and we return true.
                if (!stack.isEmpty() && stack.peek() < nums[j]) {
                    return true;
                }

                // Otherwise, push the current number onto the stack.
                stack.push(nums[j]);
            }
        }

        return false; // No 132 pattern found. 
    }
}