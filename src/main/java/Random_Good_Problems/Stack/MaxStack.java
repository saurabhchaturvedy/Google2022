package main.java.Random_Good_Problems.Stack;

import java.util.Stack;

public class MaxStack {

    private Stack<Integer> stack;
    private Stack<Integer> maxStack;

    public MaxStack() {
        stack = new Stack<Integer>();
        maxStack = new Stack<Integer>();
    }

    public void push(int number) {
        stack.push(number);
        if (maxStack.isEmpty()) {
            maxStack.push(number);
        } else if (maxStack.peek() <= number) {
            maxStack.push(number);
        }
    }

    public int pop() {
        if (stack.peek().equals(maxStack.peek())) {
            maxStack.pop();
        }
        return stack.pop();
    }

    public int max() {
        return maxStack.peek();
    }

    public static void main(String[] args) {
        MaxStack maxStack = new MaxStack();
        maxStack.push(23);
        maxStack.push(78);
        maxStack.push(16);

        System.out.println(maxStack.max());
    }
}
