package main.java.PriorityQueue_Heaps;

public class MaxPQ {

    int[] heap;
    int n;

    MaxPQ(int capacity) {
        heap = new int[capacity + 1];
        n = 0;
    }

    private boolean isEmpty() {
        return n == 0;
    }

    private int size() {
        return n;
    }


    public static void main(String[] args) {

    }
}
