package main.java.CodingSimplified_Nov2022.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class _3_KthLargestElement {


    public int KthLargestMaxHeap(int[] arr, int k) {
        if (arr.length < k) {
            return -1;
        }

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            priorityQueue.add(arr[i]);
        }

        for (int i = 0; i < k - 1; i++) {
            priorityQueue.poll();
        }

        return priorityQueue.peek();
    }


    public int KthLargestMinHeap(int[] arr, int k) {
        if (arr.length < k) {
            return -1;
        }

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            priorityQueue.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if (priorityQueue.peek() < arr[i]) {
                priorityQueue.poll();
                priorityQueue.add(arr[i]);
            }
        }

        return priorityQueue.peek();
    }


    public static void main(String[] args) {

        int[] arr = {10, 7, 11, 5, 27, 8, 20, 45};

        _3_KthLargestElement kthLargestElement = new _3_KthLargestElement();
        int element = kthLargestElement.KthLargestMaxHeap(arr, 3);
        System.out.println("element is " + element);

        int element2 = kthLargestElement.KthLargestMinHeap(arr, 3);
        System.out.println("element is " + element2);
    }
}
