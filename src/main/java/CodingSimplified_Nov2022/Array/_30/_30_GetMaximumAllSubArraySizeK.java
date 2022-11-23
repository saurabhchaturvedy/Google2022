package main.java.CodingSimplified_Nov2022.Array._30;

import java.util.ArrayDeque;
import java.util.Deque;

public class _30_GetMaximumAllSubArraySizeK {


    public void maximumInSizeK(int[] arr, int k) {
        if (arr.length == 0 || k < 0 || k > arr.length) {
            return;
        }

        int i = 0;

        Deque<Integer> queue = new ArrayDeque<>();

        for (i = 0; i < k; i++) {
            while (!queue.isEmpty() && arr[i] >= arr[queue.peekLast()]) {
                queue.removeLast();
            }

            queue.addLast(i);
        }

        for (; i < arr.length; i++) {
            System.out.print(arr[queue.peek()] + " ");

            while (!queue.isEmpty() && i - k >= queue.peek()) {
                queue.removeFirst();
            }


            while (!queue.isEmpty() && arr[i] >= arr[queue.peekLast()]) {
                queue.removeLast();
            }

            queue.addLast(i);
        }


        System.out.print(arr[queue.peek()]);
    }


    public static void main(String[] args) {

        int arr[] = {2, 5, 4, 3, 1, 7};

        _30_GetMaximumAllSubArraySizeK maximumAllSubArraySizeK = new _30_GetMaximumAllSubArraySizeK();
        maximumAllSubArraySizeK.maximumInSizeK(arr, 3);

    }
}
