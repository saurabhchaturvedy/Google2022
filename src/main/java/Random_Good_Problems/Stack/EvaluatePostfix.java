package main.java.Random_Good_Problems.Stack;

import java.util.Stack;

public class EvaluatePostfix {
    public int evaluatePostFix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char character = expression.charAt(i);

            if (!Character.isDigit(character)) {
                Integer x = stack.pop();
                Integer y = stack.pop();

                switch (character) {
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
                stack.push(Character.getNumericValue(character));
            }
        }
        return stack.pop();
    }
}