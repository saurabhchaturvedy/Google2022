package main.java.Random_Good_Problems.RandomGoodProblems_2.MicrosoftOA;

import java.util.HashSet;
import java.util.Set;

public class MinSubstringsWithoutRepeating {

    public static int getMinSubstrings(String str) {
        int right = 0;
        int substringCount = 0;
        Set<Character> set = new HashSet<>();
        while (right < str.length()) {
            if (set.contains(str.charAt(right))) {
                substringCount++;
                set.clear();
            }
            set.add(str.charAt(right));
            right++;
        }
        return substringCount + 1;
    }

    public static void main(String[] args) {
        String str = "cycle";
        System.out.println(getMinSubstrings(str));
    }
}
