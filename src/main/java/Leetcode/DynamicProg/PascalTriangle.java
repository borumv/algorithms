package Leetcode.DynamicProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();

        List<Integer> prev = new ArrayList<>();

        prev.add(1);
        output.add(prev);

        for (int i = 2; i <= numRows ; i++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1); //first
            for (int j = 0; j < prev.size() - 1; j++) {
                curr.add(prev.get(j) + prev.get(j + 1));
            }
            curr.add(1); //last
            output.add(curr);
            prev = curr;
        }
        return output;
    }
}
