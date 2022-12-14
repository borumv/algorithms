package BitMasks;

public class BinaryExponentation {


    public static void main(String[] args) {
        int  result = binaryExponentation(3, 12);
        System.out.println("Result - " + result);
    }

    private static int binaryExponentation(int i, int power) {
        if(power == 0){
            return 1;
        }
        else if((power & 1) != 0){
            return binaryExponentation(i, power - 1) * i;
        }
        else {
            return binaryExponentation(i, power/2) * binaryExponentation(i, power/2);
        }
    }
}
