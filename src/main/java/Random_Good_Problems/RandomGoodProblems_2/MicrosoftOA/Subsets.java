package main.java.Random_Good_Problems.RandomGoodProblems_2.MicrosoftOA;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());
        if(nums == null || nums.length == 0){
            return subsets;
        }
        int index = 0;
        for(int n:nums){
            index = subsets.size();
            for(int i = 0;i<index;i++){
                List<Integer> subset = new ArrayList<>(subsets.get(i));
                subset.add(n);
                subsets.add(subset);
            }
        }
        return subsets;

    }


    public static void main(String[] args) {

        int[] arr = {1,2,3};
        System.out.println(subsets(arr));
    }
}
