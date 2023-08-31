package Leetcode.strings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {


    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length())
            return false;
        Map<Object, Object> index = new HashMap<>();


        /*
        * abbaa
        * cat dog cat cat cat
        * index.put(pattern.charAt(i), i) - null
        * index.put(words[i], i) - null
        * {a:0, cat:0}
        * index.put(pattern.charAt(i), i) - null
        * index.put(words[i], i) - null
        * {a:0, cat:0, b:1, dog:1}
        * index.put(pattern.charAt(i), i) - 1
        * index.put(words[i], i) - 0
        * */
        for (int i = 0; i<words.length; ++i)
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
                return false;
        return true;
    }

    public static void main(String[] args) {

        var isAcc = wordPattern("abbaa", "cat dog dog cat cat");
        String s = new String();

        System.out.println(s);
        System.out.println(isAcc);


    }
}
