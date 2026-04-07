class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        boolean first = true;
        int num1, num2, result;
        for(String token : tokens){
            switch(token){
                case "+":
                    num2 = Integer.parseInt(stack.pop());
                    num1 = Integer.parseInt(stack.pop());
                    result = num1 + num2;
                    stack.push(Integer.toString(result));
                    break;
                case "-":
                    num2 = Integer.parseInt(stack.pop());
                    num1 = Integer.parseInt(stack.pop());
                    result = num1 - num2;
                    stack.push(Integer.toString(result));
                    break;
                case "*":
                    num2 = Integer.parseInt(stack.pop());
                    num1 = Integer.parseInt(stack.pop());
                    result = num1 * num2;
                    stack.push(Integer.toString(result));
                    break;
                case "/":
                    num2 = Integer.parseInt(stack.pop());
                    num1 = Integer.parseInt(stack.pop());
                    result = num1 / num2;
                    stack.push(Integer.toString(result));
                    break;
                default:
                    stack.push(token);
            }
        }

        return Integer.parseInt(stack.pop());
    }
}
