package trash;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzInterviewTest {
    FizzBuzzInterview fizzBuzzInterview;
    private static final byte[] FIZZ = "Fizz".getBytes();
    private static final byte[] FIZZBUZZ = "FizzBuzz".getBytes();


    @BeforeEach
    void init(){
        fizzBuzzInterview = new FizzBuzzInterview();
    }
    @Test
    void ShouldReturnFizz() {
        assertArrayEquals(fizzBuzzInterview.fizbuzztest(3), FIZZ);
    }

    @Test
    void ShouldReturnFizzBuzz() {
        assertArrayEquals(fizzBuzzInterview.fizbuzztest(15), FIZZBUZZ);
    }

    @Test
    void ShouldThrowIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class , () ->{
            fizzBuzzInterview.fizbuzztest(1);
        });
        assertEquals("error", exception.getMessage());
        //assertThrows(IllegalArgumentException.class, fizzBuzzInterview.fizbuzztest(1))
       // assertThrows(fizzBuzzInterview.fizbuzztest(1), IllegalArgumentException.class);
    }
}