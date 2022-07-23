package main.java.Queue;

import java.util.List;
import java.util.NoSuchElementException;

public class Queue {


    ListNode front;
    ListNode rear;

    int length;

    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }


    Queue() {

        this.front = null;
        this.rear = null;
        this.length = 0;
    }


    private boolean isEmpty() {
        return length == 0;
    }

    private int length() {
        return length;
    }


    private void enqueue(int data) {

        ListNode temp = new ListNode(data);
        if (front == null) {
            front = temp;
        } else {
            rear.next = temp;
        }

        rear = temp;
        length++;
    }

    private int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("no elements in queue");
        }

        int result = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        length--;

        return result;
    }


    private void print() {

        ListNode temp = front;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {


        Queue queue = new Queue();

        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(11);


        queue.print();

        queue.dequeue();

        System.out.println();
        queue.print();
    }
}
