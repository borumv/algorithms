package Leetcode.wordpatterns;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsAnagramTest {

    IsAnagram isAnagram;

    @BeforeEach
    void setUp() {
        isAnagram = new IsAnagram();
    }

    @Test
    void shouldReturnTrue() {
        String s = "anagram";
        String t = "nagaram";
        boolean expected = true;
        assertEquals(expected, isAnagram.isAnagram(s, t));
    }

    @Test
    void shouldReturnFalse() {
        String s = "rat";
        String t = "car";
        boolean expected = false;
        assertEquals(expected, isAnagram.isAnagram(s, t));
    }
}