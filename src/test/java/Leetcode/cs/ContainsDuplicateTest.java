package Leetcode.cs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    ContainsDuplicate containsDuplicate;
    @BeforeEach
    void setUp() {
        containsDuplicate = new ContainsDuplicate();
    }

    @Test
    void shouldReturnTrue() {
        int[]massive = {1,2,3,1};
        boolean actual = containsDuplicate.containsDuplicate(massive);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnTrueSecond() {
        int[]massive = {1,1,1,3,3,4,3,2,4,2};
        boolean actual = containsDuplicate.containsDuplicate(massive);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnFalse() {
        int[]massive = {1,1,1,3,3,4,3,2,4,2};
        boolean actual = containsDuplicate.containsDuplicate(massive);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}