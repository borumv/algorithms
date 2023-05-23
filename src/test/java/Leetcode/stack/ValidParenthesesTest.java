package Leetcode.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    ValidParentheses validParentheses;
    @BeforeEach
    void setUp() {
        validParentheses = new ValidParentheses();
    }

    @Test
    void shouldReturnTrue() {
        String input = "()";
        boolean expected = true;
        assertEquals(expected, validParentheses.isValid(input));
    }
    @Test
    void shouldReturnTrueSecond() {
        String input = "()[]{}";
        boolean expected = true;
        assertEquals(expected, validParentheses.isValid(input));
    }

    @Test
    void shouldReturnFalse() {
        String input = "(]";
        boolean expected = false;
        assertEquals(expected, validParentheses.isValid(input));
    }
}