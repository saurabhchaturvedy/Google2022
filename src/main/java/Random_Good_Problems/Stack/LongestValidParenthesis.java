package main.java.Random_Good_Problems.Stack;

import java.util.Stack;

class LongestValidParenthesis {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int len = s.length();
        int longest = 0;
        stack.push(-1);
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    longest = Math.max(longest, i - stack.peek());
                }
            }
        }
        return longest;
    }
}