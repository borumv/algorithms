package Leetcode.strings;

import java.util.HashMap;
import java.util.Map;

//**
// Given a string s, find the length of the longest
//substring
//without repeating characters.
//https://leetcode.com/problems/longest-substring-without-repeating-characters/
// */
public class LongestSubString {

    // ---
    //abcabcbb
    public int lengthOfLongestSubstring(String s) {

        if (s.length() == 0) {
            return 0;
        }
        int left = 0, right = 1, max = 1;
        Map<Character, Integer> countMap = new HashMap<>();
        countMap.put(s.charAt(0), left);
        while (right < s.length()) {
            if (countMap.containsKey(s.charAt(right))) {
                left = Math.max(left, countMap.get(s.charAt(right)) + 1);
            }
            countMap.put(s.charAt(right), right);
            max = Math.max(( right - left + 1 ), max);
            right++;
        }
        return max;
    }
}
