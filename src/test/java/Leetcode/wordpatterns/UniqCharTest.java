package Leetcode.wordpatterns;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqCharTest {

    UniqChar uniqChar;

    @BeforeEach
    void setUp() {
        uniqChar = new UniqChar();
    }

    @Test
    void shouldReturnZero() {
        String input = "leetcode";
        int expected = 0;
        assertEquals(expected, uniqChar.firstUniqChar(input));
    }

    @Test
    void shouldReturnTwo() {
        String input = "loveleetcode";
        int expected = 2;
        assertEquals(expected, uniqChar.firstUniqChar(input));
    }

    @Test
    void shouldReturnMinusOne() {
        String input = "aabb";
        int expected = -1;
        assertEquals(expected, uniqChar.firstUniqChar(input));
    }
}