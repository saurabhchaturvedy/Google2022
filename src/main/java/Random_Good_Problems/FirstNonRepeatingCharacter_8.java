package main.java.Random_Good_Problems;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter_8 {


    private static Character firstNonRepeating(String str) {
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < chars.length; i++) {

            char ch = chars[i];

            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return Character.MIN_VALUE;
    }


    public static void main(String[] args) {

        System.out.println("First non repeating character is : " + firstNonRepeating("codeforcode"));
    }
}
