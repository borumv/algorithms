package Leetcode.anagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*//
Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".


"acdcaeccde"
"c"
 */

public class AllAnagramsInString {

    public List<Integer> findAnagrams(String s, String p) {
        int[] map = new int[26];
        List<Integer> result = new ArrayList<>();

        for(int i=0;i<p.length();i++){
            map[p.charAt(i) - 'a']++;
        }

        int windowStart = 0;
        int windowEnd = 0;
        while(windowEnd<s.length()){
            // valid anagram
            if(map[s.charAt(windowEnd) - 'a'] > 0){
                map[s.charAt(windowEnd++) - 'a']--;
                // window size equal to size of P
                if(windowEnd-windowStart ==  p.length()){
                    result.add(windowStart);
                }
            }
            // window is of size 0
            else if(windowStart == windowEnd){
                windowStart ++;
                windowEnd ++;
            }
            // decrease window size
            else{
                map[s.charAt(windowStart++) - 'a']++;
            }
        }
        return result;
    }

    private static Map<Character, Integer> makeCountMap(String p) {
        Map<Character, Integer> subWord = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            if(subWord.containsKey(p.charAt(i))){
                subWord.replace(p.charAt(i), subWord.get(p.charAt(i)) + 1);
            }else {
                subWord.put(p.charAt(i), 1);
            }
        }
        return subWord;
    }
}
