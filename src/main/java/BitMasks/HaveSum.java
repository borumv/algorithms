package BitMasks;

public class HaveSum {
    public static void main(String[] args) {
        int [] ma = new int[]{8,2,3,4,5};
        haveSum(ma, 3);
    }
    public static void haveSum(int[] massive, int needSum){
        int count = massive.length;
        for (int mask = 0; mask < 1 << count ; mask++) {
            int sum = 0;
            for (int i = 0; i < count; i++) {
                if((mask & (1 << i)) > 0) {
                    sum += massive[i];
                }
            }
            if(sum == needSum) {
                System.out.println("YES indexes:" );
                for (int i = 0; i < count; i++) {
                    if((mask & (1 << i)) > 0) {
                        System.out.println(i);
                    }
                }
                return;
            }
        }

    }
}
