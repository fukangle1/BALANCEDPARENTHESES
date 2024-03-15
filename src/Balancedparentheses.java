import java.util.Stack;

public class Balancedparentheses {

    public boolean checkBalancedParentheses(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char opening = stack.pop();
                if ((c == ')' && opening != '(') || (c == ']' && opening != '[') || (c == '}' && opening != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}