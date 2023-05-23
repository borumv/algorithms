package windowsliding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TestTest {

    TestWindow windowSliding;
    @BeforeEach
    void setUp() {
        windowSliding = new TestWindow();
    }


    @Test
    void shouldReturnThree(){
       String input = "abcabcbb";
       int expected = 3;
       int actual = windowSliding.lengthOfLongestSubstring(input);
       assertEquals(expected, actual);
    }
}