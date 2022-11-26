package main.java.Random_Good_Problems.RandomGoodProblems_2.MicrosoftOA.EricProgramming.Backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Recursion {


    public void recurse(List<Integer> list, List<Integer> holder) {
        if (list.size() == 0) {
            System.out.println(holder);
            return;
        }

        for (int i = 0; i < list.size(); i++) {

            Integer remove = list.remove(i);
            holder.add(remove);
            recurse(list, holder);

            System.out.println(remove);
        }
    }


    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        List<Integer> holder = new ArrayList<>();
        Recursion recursion = new Recursion();
        recursion.recurse(list, holder);
    }
}
