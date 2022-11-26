package main.java.Random_Good_Problems.RandomGoodProblems_2.MicrosoftOA.Backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Permutations {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> decisionTree = new LinkedList<>();
        for (int num : nums) {
            decisionTree.add(num);
        }
        helper(decisionTree, new LinkedList<>());
        return res;
    }

    private void helper(List<Integer> decisionTree, List<Integer> curComb) {
        if (decisionTree.isEmpty()) {
            List<Integer> temp = new LinkedList<>(curComb);
            res.add(temp);
            return;
        }
        for (int i = 0; i < decisionTree.size(); i++) {
            Integer val = decisionTree.remove(i);
            curComb.add(val);
            helper(decisionTree, curComb);
            // Reverse the changes to get ready for the next iteration
            curComb.remove(curComb.size() - 1);
            decisionTree.add(i, val);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        Permutations permutations1 = new Permutations();
        System.out.println(permutations1.permute(arr));
    }
}
