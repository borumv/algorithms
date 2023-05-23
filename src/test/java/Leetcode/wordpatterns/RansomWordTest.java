package Leetcode.wordpatterns;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomWordTest {

    RansomWord ransomWord;
    @BeforeEach
    void setUp() {
        ransomWord = new RansomWord();
    }

    @Test
    void shouldReturnFalse() {
        String ransomNote = "a";
        String magazine = "b";
        boolean expected = false;
        assertEquals(expected, ransomWord.canConstruct(ransomNote, magazine));
    }

    @Test
    void shouldReturnFalse2() {
        String ransomNote = "aa";
        String magazine = "bb";
        boolean expected = false;
        assertEquals(expected, ransomWord.canConstruct(ransomNote, magazine));
    }

    @Test
    void shouldReturnTrue() {
        String ransomNote = "aa";
        String magazine = "aab";
        boolean expected = true;
        assertEquals(expected, ransomWord.canConstruct(ransomNote, magazine));
    }
}