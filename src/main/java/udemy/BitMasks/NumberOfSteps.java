package udemy.BitMasks;

public class NumberOfSteps {
    public int countNumber(int number){
        int count_steps = 0;
        while(number != 0) {
            if ((number & 1) == 1) {
                number -= 1;
            }
            else {
                number = number >> 1;
            }
            count_steps++;
        }
        return count_steps;
    }
}
