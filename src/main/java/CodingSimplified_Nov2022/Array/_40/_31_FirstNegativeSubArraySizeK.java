package main.java.CodingSimplified_Nov2022.Array._40;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Stream;

public class _31_FirstNegativeSubArraySizeK {


    public List<Integer> firstNegativeInEverySubArraySizeK(int[] arr, int k) {
        if (arr.length == 0 || k < 0 || k > arr.length) {
            return new ArrayList<>();
        }

        int i = 0;
        int j = 0;
        int n = arr.length;

        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        while (j < n) {
            if (arr[j] < 0) {
                queue.add(arr[j]);
            }

            if (j - i + 1 == k) {
                if (!queue.isEmpty()) {
                    list.add(queue.poll());
                } else {
                    list.add(0);
                }
                if (arr[i] < 0 && !queue.isEmpty()) {
                    queue.poll();

                }
                i++;
            }


            j++;
        }

        return list;
    }


    public static void main(String[] args) {

        int[] arr = {8, 1, -2, 2, -3, 6, 8, 1};
        _31_FirstNegativeSubArraySizeK firstNegativeSubArraySizeK = new _31_FirstNegativeSubArraySizeK();
        List<Integer> integers = firstNegativeSubArraySizeK.firstNegativeInEverySubArraySizeK(arr, 3);
        Stream.of(integers).forEach(x -> System.out.print(x + " "));
    }
}
