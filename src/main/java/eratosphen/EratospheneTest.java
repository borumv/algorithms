package eratosphen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EratospheneTest {
    public static void main(String[] args) {
        search(100);
    }
    public static void search(int numbers){
        boolean[] marks = new boolean[numbers];
        Arrays.fill(marks, true);
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        for (int i = 3; i * i < numbers ; i += 2) {

            if(marks[i]){
                for (int j = i * i; j < numbers; j+=i) {
                    marks[j] = false;
                }
            }
        }
        for (int i = 3; i < numbers; i+=2) {
            if(marks[i]) {
                primes.add(i);
            }
        }
        for (Integer prime : primes) {
            System.out.println(prime);
        }
    }
}
