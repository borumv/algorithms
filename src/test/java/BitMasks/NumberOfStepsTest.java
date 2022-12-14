package BitMasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfStepsTest {

    @Test
    void shouldReturnSix(){
        NumberOfSteps numberOfSteps = new NumberOfSteps();
        int expected = 6;
        assertEquals(expected, numberOfSteps.countNumber(14));
    }

}