package BitMasks;

//*
// Input: nums = [4,1,2,1,2]
// Output: 4
//
// /

public class BitMaskExample {
    public static void main(String[] args) {
        System.out.println(6 & (1<<2));
        int[] massive = {1,2,3};
        int n = massive.length;
        for (int mask = 0; mask < 1<<n; mask++) {
            System.out.print("{");
            for (int i = 0; i < n; i++) {
                if(((mask & (1 << i)) != 0)){
                    System.out.print(massive[i] + " ,");
                }
            }
            System.out.print("}");
            System.out.println();
        }
    }
}
