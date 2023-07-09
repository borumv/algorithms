package udemy.BitMasks;

public class SingleNumber {
    public static void main(String[] args) {
        int[]massive = new int[]{1,3,1,2,2};
        System.out.println(singleNumber(massive));
    }
    public static int singleNumber(int[] A){
        int x = 0;
        for (int a : A) {
            x = x ^ a;
        }
        return x;
    }
}
