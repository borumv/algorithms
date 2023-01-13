package AlgoCourse2022;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpiralOrderTest {

    @Test
    void test1(){
        int[][] input = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> output = new ArrayList<>(List.of(1, 2, 3, 6, 9, 8, 7, 4, 5));
        SpiralOrder spiralOrder = new SpiralOrder();
        assertEquals(output, spiralOrder.spiralOrder(input));
    }
}