package Leetcode.anagrams;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;


class AllAnagramsInStringTest {

    @Test
    void shouldReturnNullOneTwo(){
        AllAnagramsInString allAnagramsInString = new AllAnagramsInString();
        String s = "abab";
        String p = "ab";
        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(1);
        result.add(2);
        assertEquals(result, allAnagramsInString.findAnagrams(s,p));
    }

    @Test
    void shouldReturnNullAndSix(){
        AllAnagramsInString allAnagramsInString = new AllAnagramsInString();
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(6);
        assertEquals(result, allAnagramsInString.findAnagrams(s,p));
    }

    //"acdcaeccde"
    //"c"

    @Test
    void shouldReturnC(){
        AllAnagramsInString allAnagramsInString = new AllAnagramsInString();
        String s = "acdcaeccde";
        String p = "c";
        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(3);
        result.add(6);
        result.add(7);
        assertEquals(result, allAnagramsInString.findAnagrams(s,p));
    }

}