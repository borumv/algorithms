package AlgoCourse2022;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {

    @Test
    void isHappy(){
        int input = 19;
        boolean result = true;
        HappyNumber h = new HappyNumber();
        assertEquals(result, h.isHappy(input));
    }

}