package arrayStringProblems;

import java.util.Stack;

public class ValidParenthesis{

    public boolean isValidParenthesis(String arg) {
        Stack<Character> stk = new Stack<Character>();
        for (char ch : arg.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stk.push(ch);
            } else if (ch == ')' && !stk.isEmpty() && stk.peek() == '(') {
                stk.pop();
            } else if (ch == '}' && !stk.isEmpty() && stk.peek() == '{') {
                stk.pop();
            } else if (ch == ']' && !stk.isEmpty() && stk.peek() == '[') {
                stk.pop();
            }
        }
        return stk.isEmpty();
    }

    public static void main(String[] args) {
        String str = "(){}[]";
        boolean b = new ValidParenthesis().isValidParenthesis(str);
        System.out.println(b);
    }
}
