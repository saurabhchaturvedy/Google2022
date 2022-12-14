package main.java.Random_Good_Problems.RandomGoodProblems_2.MicrosoftOA;

import java.util.*;

public class SameIndexStrings {


    public static int[] sameIndexStringPairs(String[] str) {

        Map<Integer, List<Character>> map = new HashMap<>();

        for (int i = 0; i < str.length; i++) {
            String current = str[i];

            for (int j = 0; j < current.length(); j++) {
                if (!map.containsKey(j)) {
                    List<Character> characters = new ArrayList<>();
                    characters.add(current.charAt(j));
                    map.put(j, characters);

                } else {
                    List<Character> characters = map.get(j);
                    if (characters.contains(current.charAt(j))) {
                        int firstString = characters.indexOf(current.charAt(j));
                        return new int[]{firstString, i, j};
                    } else {
                        characters.add(current.charAt(j));
                        map.put(j, characters);
                    }
                }
            }
        }

        return new int[]{};
    }


    public static void main(String[] args) {


        Arrays.stream(sameIndexStringPairs(new String[]{"bdafg", "ceagi"})).forEach(System.out::println);
    }
}
