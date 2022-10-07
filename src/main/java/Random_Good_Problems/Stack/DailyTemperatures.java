package main.java.Random_Good_Problems.Stack;

import java.util.Arrays;
import java.util.Stack;

class DailyTemperatures {
    public static int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[T.length];
        for (int i = T.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && T[stack.peek()] <= T[i]) stack.pop();
            if (!stack.isEmpty()) {
                res[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 67};

        Arrays.stream(dailyTemperatures(temperatures)).forEach(i -> System.out.print(i + " "));
    }
}