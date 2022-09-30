package main.java.Random_Good_Problems.Stack;

import java.util.Stack;

public class ValidParenthesis {


    private static boolean isValid(String str) {
        if (str == null) return false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!stack.isEmpty() && match(stack.peek(), ch)) {
                stack.pop();
            } else {

                stack.push(ch);

            }
        }

        return stack.isEmpty();
    }

    private static boolean match(char c1, char c2) {
        return (c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}');

    }


    public static void main(String[] args) {

        System.out.println(isValid("[()]"));
    }
}
