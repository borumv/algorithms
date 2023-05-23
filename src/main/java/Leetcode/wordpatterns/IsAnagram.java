package Leetcode.wordpatterns;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
https://leetcode.com/problems/valid-anagram/description/?envType=study-plan&id=data-structure-i
 */

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
          if (s.length() > t.length()) return false;

        int[] alphabets_counter = new int[26];

        for (char c : s.toCharArray())
            alphabets_counter[c-'a']++;

        for (char c : t.toCharArray()){
            if (alphabets_counter[c-'a'] == 0) return false;
            alphabets_counter[c-'a']--;
        }
        for (int i : alphabets_counter) {
            if (i > 0){
                return false;
            }
        }
        return true;
    }
}
