package main.java.CodingSimplified_Nov2022.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class _2_PriorityQueue {


    public static void main(String[] args) {

        int[] arr = {9, 2, 18, 21, 15, 7, 11};

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            priorityQueue.add(arr[i]);
            System.out.print(priorityQueue.peek() + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            priorityQueue.poll();
            System.out.print(priorityQueue.peek() + " ");
        }

        System.out.println();

        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            priorityQueue2.add(arr[i]);
            System.out.print(priorityQueue2.peek() + " ");
        }
    }


}
