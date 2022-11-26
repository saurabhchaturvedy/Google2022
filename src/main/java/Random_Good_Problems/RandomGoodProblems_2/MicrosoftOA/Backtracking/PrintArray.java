package main.java.Random_Good_Problems.RandomGoodProblems_2.MicrosoftOA.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PrintArray {


    static void printArray(int[]arr,int index)
    {
        if(index== arr.length) return;
        printArray(arr,index+1);
        System.out.println(arr[index]);

    }


    public static void main(String[] args) {
        int[]arr = {1,2,3,4};
        printArray(arr,0);

        List<Integer> lst = new ArrayList<>();
        lst.add(0,5);
        lst.add(0,8);

        System.out.println(lst);
    }
}
