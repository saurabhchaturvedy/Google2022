package main.java.Stack;

import java.util.List;

public class Stack {

    ListNode top;
    int length;

    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }


    Stack() {
        this.top = null;
        this.length = 0;
    }

    private boolean isEmpty() {
        return length == 0;
    }

    private int length() {
        return length;
    }


    private void push(int data) {
        ListNode temp = new ListNode(data);

        temp.next = top;
        top = temp;
        length++;

    }

    private int pop() {
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }


    private void print() {
        ListNode temp = top;

        while (temp != null) {
            System.out.print(temp.data + " - ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(13);
        stack.push(8);
        stack.push(9);
        stack.push(5);

        stack.print();

        stack.pop();

        System.out.println();
        stack.print();
    }
}
