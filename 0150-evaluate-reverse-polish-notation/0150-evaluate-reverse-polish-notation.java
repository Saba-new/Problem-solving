class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (String token : tokens) {
            if (isOperator(token)) {
                int num1 = Integer.parseInt(stack.pop()); // right operand
                int num2 = Integer.parseInt(stack.pop()); // left operand
                int result = 0;

                if (token.equals("+")) {
                    result = num2 + num1;
                } else if (token.equals("*")) {
                    result = num2 * num1;
                } else if (token.equals("-")) {
                    result = num2 - num1;
                } else if (token.equals("/")) {
                    result = num2 / num1;
                }
                stack.push(Integer.toString(result));
            } else {
                stack.push(token);
            }
        }
        return Integer.parseInt(stack.peek());
    }

    private boolean isOperator(String str) {
        return str.equals("+") || str.equals("*") || str.equals("-") || str.equals("/");
    }
}
