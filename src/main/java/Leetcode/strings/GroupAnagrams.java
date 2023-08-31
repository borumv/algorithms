package Leetcode.strings;

import java.util.*;

//*
// Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
// */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<Set<Character>, List<String>> anagramsMap = new HashMap<>();
        for (String str : strs) {
            Set<Character> characters = new HashSet<>();
            for (int i = 0; i < str.toCharArray().length; i++) {
                characters.add(str.charAt(i));
            }
            anagramsMap.merge(characters, List.of(str), (oldValue, newValue) -> {
                oldValue.addAll(newValue);
                return oldValue;
            });
        }
        return anagramsMap.values().stream().toList();
    }
}
