package Leetcode.wordpatterns;


import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
https://leetcode.com/problems/first-unique-character-in-a-string/description/?envType=study-plan&id=data-structure-i
 */
public class UniqChar {
    public int firstUniqChar(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            charMap.merge(s.charAt(i), 1 , Integer::sum);

        }
        for (int i = 0; i < s.length(); i++) {
            if(charMap.get(s.charAt(i)) == 1){
                return i;
            }
        }

    return  -1;
    }
}
