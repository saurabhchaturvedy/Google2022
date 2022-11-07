package main.java.Random_Good_Problems.RandomGoodProblems_2;

import java.util.Stack;

public class _11_ReverseAStack {

    private Stack<Integer> reverseAStack(Stack<Integer> stack, int index) {

        if (index == stack.size() - 1) return stack;
        Integer stackItem = stack.pop();
        stack.add(index, stackItem);
        index++;
        return reverseAStack(stack, index);

    }

    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();
        intStack.add(1);
        intStack.add(2);
        intStack.add(3);
        intStack.add(4);
        intStack.add(5);
        System.out.println("Original stack " + intStack);
        System.out.println("Value at top " + intStack.peek());
        _11_ReverseAStack reverseAStack = new _11_ReverseAStack();
        Stack<Integer> reversedStack = reverseAStack.reverseAStack(intStack, 0);
        System.out.println("Reversed stack is " + reversedStack);
        System.out.println("Value at top " + intStack.peek());
    }
}