package main.java.Random_Good_Problems;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement_15 {


    private static int[] nextGreaterElement(int[] arr) {
        if (arr == null) return null;

        int[] result = new int[arr.length];
        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                result[stack.pop()] = arr[i];
            }

            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {8,3,5};

        int[] ints = nextGreaterElement(arr);

        for (int x : ints) {
            System.out.print(x + " ");
        }

    }
}
