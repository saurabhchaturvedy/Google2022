package main.java.Random_Good_Problems;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeating_4 {


    private static int longestSubstring(String str) {
        Map<Character, Integer> characterCountMap = new HashMap<>();

        int max_length = 0;
        int start = 0;

        for (int end = 0; end < str.length(); end++) {

            Character c = str.charAt(end);

            if (characterCountMap.containsKey(c)) {
                start = Math.max(start, characterCountMap.get(c) + 1);
            }

            characterCountMap.put(c, end);
            max_length = Math.max(max_length, end - start + 1);
        }

        return max_length;
    }

    public static void main(String[] args) {

        String str="aabcftyurkkkyy";

        System.out.println("Longest substring without repeating characters is : "+longestSubstring(str));
    }
}
