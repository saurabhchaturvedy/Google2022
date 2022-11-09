package main.java.CodingSimplified_Nov2022.Heap;

import java.util.PriorityQueue;

public class _4_KthLargestElement_Stream {

    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

    public int KthLargest(int num, int k) {

        if (priorityQueue.size() < k) {
            priorityQueue.offer(num);
            return priorityQueue.size() == k ? priorityQueue.peek() : -1;
        }

        if (num > priorityQueue.peek()) {
            priorityQueue.poll();
            priorityQueue.offer(num);
        }

        return priorityQueue.peek();
    }


    public static void main(String[] args) {

        int[] arr = {10, 7, 11, 5, 27, 8, 20, 45};
        _4_KthLargestElement_Stream kthLargestElement_stream = new _4_KthLargestElement_Stream();
        for (int i = 0; i < args.length; i++) {
            System.out.print(kthLargestElement_stream.KthLargest(arr[i], 3) + " ");
        }
    }
}
