class Solution {
    
    public int evalRPN(String[] arr) {

        Stack<Integer> stack = new Stack<>();
  
        for (int i = 0; i < arr.length; i++) {

            switch (arr[i]) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
          
                case "-":
                    stack.push(-stack.pop() + stack.pop());
                    break;
          
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;

                case "/":
                    int n1 = stack.pop(), n2 = stack.pop();
                    stack.push(n2 / n1);
                break;
          
                default:
                stack.push(Integer.parseInt(arr[i]));
            }
        }
        return stack.pop();
    }    
}