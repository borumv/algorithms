package Leetcode.DynamicProg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonachiTest {

    @Test
    void shouldReturnOneIfEqualsTwo(){
        Fibonachi fibonachi = new Fibonachi();
        assertEquals(1, fibonachi.fib(2));
    }

    @Test
    void shouldReturnTwoIfEqualsThree(){
        Fibonachi fibonachi = new Fibonachi();
        assertEquals(2, fibonachi.fib(3));
    }


    @Test
    void shouldReturnThreeIfEqualsFour(){
        Fibonachi fibonachi = new Fibonachi();
        assertEquals(3, fibonachi.fib(4));
    }

}