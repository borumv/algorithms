package Leetcode.wordpatterns;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
 //"badc"
 //"baba"
    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc", "baba"));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() == t.length()) {
            Map<Character, Character> isomorshMap = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                if (isomorshMap.get(s.charAt(i)) != null) {
                    if (!isomorshMap.get(s.charAt(i)).equals(t.charAt(i))) {
                        return false;
                    }
                } else if (isomorshMap.get(s.charAt(i)) == null && isomorshMap.containsValue(t.charAt(i))) {
                    return false;
                } else {
                    isomorshMap.put(s.charAt(i), t.charAt(i));
                }
            }
        }
        return true;
    }
}
