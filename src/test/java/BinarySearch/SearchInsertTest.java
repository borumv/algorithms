package BinarySearch;

import org.junit.jupiter.api.Test;
import udemy.BinarySearch.SearchInsert;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertTest {


    @Test
    void shouldReturnTwo(){
        int [] input = new int[]{1,3,5,6};
        int target = 5;
        int output = 2;
        SearchInsert searchInsert = new SearchInsert();
        assertEquals(output, searchInsert.searchInsert(input, target));
    }
    @Test
    void shouldReturnOne(){
        int [] input = new int[]{1,3,5,6};
        int target = 2;
        int output = 1;
        SearchInsert searchInsert = new SearchInsert();
        assertEquals(output, searchInsert.searchInsert(input, target));
    }
    @Test
    void shouldReturnFour(){
        int [] input = new int[]{1,3,5,6};
        int target = 7;
        int output = 4;
        SearchInsert searchInsert = new SearchInsert();
        assertEquals(output, searchInsert.searchInsert(input, target));
    }

    @Test
    void shouldReturnZero(){
        int [] input = new int[]{1,3};
        int target = 2;
        int output = 1;
        SearchInsert searchInsert = new SearchInsert();
        assertEquals(output, searchInsert.searchInsert(input, target));
    }
}