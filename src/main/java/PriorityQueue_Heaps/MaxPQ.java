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

    private void insert(int x) {
        if (n == heap.length - 1) {
            resize(2 * heap.length);
        }

        n++;
        heap[n] = x;
        swim(n);
    }

    private void swim(int k) {

        while (k > 1 && heap[k / 2] < heap[k]) {
            int temp = heap[k / 2];
            heap[k / 2] = heap[k];
            heap[k] = temp;
            k = k / 2;
        }
    }


    private void resize(int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < heap.length; i++) {
            temp[i] = heap[i];
        }

        heap = temp;
    }

    private void printHeap() {
        for (int i = 1; i <= n; i++) {
            System.out.print(heap[i] + " ");
        }
    }

    public static void main(String[] args) {
        MaxPQ maxPQ = new MaxPQ(4);
        maxPQ.insert(5);
        maxPQ.insert(8);
        maxPQ.insert(3);
        maxPQ.insert(7);

        maxPQ.printHeap();
    }
}
