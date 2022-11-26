package main.java.Random_Good_Problems.RandomGoodProblems_2.MicrosoftOA.Backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum1 {


    List<List<Integer>> combinations = new ArrayList<>();
    int[] candidates;

    public List<List<Integer>> combinationSum1(int[] candidates, int target) {
        this.candidates = candidates;
        findCombinations(target, new LinkedList<Integer>(), 0);
        return combinations;
    }

    private void findCombinations(int target, LinkedList<Integer> combination, int index) {

        if (target == 0) {
            List<Integer> comb = new LinkedList<>(combination);
            combinations.add(comb);
            return;
        }


        for (int i = index; i < candidates.length; i++) {
            int new_target = target - candidates[i];
            if (new_target < 0) {
                continue;
            }
            combination.add(candidates[i]);
            findCombinations(new_target, combination, i);
            combination.remove(combination.size() - 1);
        }
    }


    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        CombinationSum1 combinationSum1 = new CombinationSum1();
        System.out.println(combinationSum1.combinationSum1(candidates, target));
    }
}
