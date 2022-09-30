package main.java.Random_Good_Problems.Stack;

import java.util.Arrays;
import java.util.Stack;

class DailyTemperatures {
    public static int[] dailyTemperatures(int[] T) {
        int[] ans = new int[T.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = T.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && T[i] >= T[stack.peek()]) {
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};

        Arrays.stream(dailyTemperatures(temperatures)).forEach(i -> System.out.print(i + " "));
    }
}