package main.java.Stack;

import java.util.Stack;

public class ReverseString {


    private static String reverse(String str) {

        char[] chars = str.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (char c : chars) {
            stack.push(c);
        }

        int index = 0;

        while (!stack.isEmpty()) {
            chars[index] = stack.pop();
            index++;
        }

        return new String(chars);
    }

    public static void main(String[] args) {


        System.out.println("Reversed string is : " + reverse("play"));
    }
}
