package main.java.Random_Good_Problems.RandomGoodProblems_2.MicrosoftOA.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum2 {

    List<List<Integer>> combinations = new ArrayList<>();
    int[] candidates;

    public List<List<Integer>> combinationSum1(int[] candidates, int target) {
        Arrays.sort(candidates);
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
            if (i != index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            int new_target = target - candidates[i];
            if (new_target < 0) {    // break because the array is sorted
                break;
            }
            combination.add(candidates[i]);
            findCombinations(new_target, combination, i + 1);
            combination.remove(combination.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2, 5, 2, 1, 2};
        int target = 5;
        CombinationSum2 combinationSum2 = new CombinationSum2();
        System.out.println(combinationSum2.combinationSum1(candidates, target));
    }
}
