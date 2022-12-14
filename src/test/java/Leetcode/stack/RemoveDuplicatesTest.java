package Leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    void shouldReturnCA(){
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        String s = "abbaca";
        assertEquals("ca", removeDuplicates.removeDuplicates(s));
    }

    @Test
    void shouldReturnAY(){
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        String s = "azxxzy";
        assertEquals("ay", removeDuplicates.removeDuplicates(s));
    }

}