package main.java.Random_Good_Problems.RandomGoodProblems_2.MicrosoftOA.EricProgramming.Backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Permutations {

    List<List<Integer>> res = new ArrayList<>();
    List<String> stringPerms = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> decisionTree = new LinkedList<>();
        for (int num : nums) {
            decisionTree.add(num);
        }
        helper(decisionTree, new LinkedList<>());
        return res;
    }

    public List<String> permuteString(String str) {
        List<Character> decisionTree = new LinkedList<>();
        for (int ch : str.toCharArray()) {
            Character c = (char) ch;
            decisionTree.add(c);
        }
        helperString(decisionTree, new LinkedList<>());
        return stringPerms;
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


    private void helperString(List<Character> decisionTree, List<Character> curComb) {
        if (decisionTree.isEmpty()) {
            char[] ch = new char[curComb.size()];
            for (int i = 0; i < curComb.size(); i++) {
                ch[i] = curComb.get(i);
            }

            stringPerms.add(new String(ch));
            return;
        }
        for (int i = 0; i < decisionTree.size(); i++) {
            Character val = decisionTree.remove(i);
            curComb.add(val);
            helperString(decisionTree, curComb);
            // Reverse the changes to get ready for the next iteration
            curComb.remove(curComb.size() - 1);
            decisionTree.add(i, val);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        Permutations permutations1 = new Permutations();
        System.out.println(permutations1.permute(arr));

        System.out.println(permutations1.permuteString("abc"));
    }
}
