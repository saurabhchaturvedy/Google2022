package main.java.CodingSimplified.Arrays;

import java.util.Arrays;

public class BubbleSort_5 {


    static int[] bubbleSort(int[]arr)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            for (int j=0; j< arr.length-1-i; j++)
            {
                if(arr[j]> arr[j+1])
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {


        int[]arr = {8,3,11,4,56,81,15,78};

        Arrays.stream(bubbleSort(arr)).forEach(System.out::println);
    }
}
