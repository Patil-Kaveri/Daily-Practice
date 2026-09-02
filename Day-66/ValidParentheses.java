import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        String str = "{[()]}";

        Stack<Character> stack = new Stack<>();

        boolean valid = true;

        for (char ch : str.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    valid = false;
                    break;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {

                    valid = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty()) {
            valid = false;
        }

        if (valid) {
            System.out.println("Valid Parentheses");
        } else {
            System.out.println("Invalid Parentheses");
        }
    }
}