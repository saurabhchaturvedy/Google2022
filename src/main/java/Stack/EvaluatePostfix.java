package main.java.Stack;

import java.util.Stack;

public class EvaluatePostfix {


    private static int evaluate(String expression) {


        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {

            char c = expression.charAt(i);

            if (!Character.isDigit(c)) {
                Integer x = stack.pop();
                Integer y = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(y + x);
                        break;

                    case '-':
                        stack.push(y - x);
                        break;
                    case '*':
                        stack.push(y * x);
                        break;

                    case '/':
                        stack.push(y / x);
                        break;
                }
            } else {

                stack.push(Character.getNumericValue(c));
            }
        }

        return stack.pop();
    }


    public static void main(String[] args) {


        System.out.println(evaluate("2 3 1 * + 9 -"));
    }
}
