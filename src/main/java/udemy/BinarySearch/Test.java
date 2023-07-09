package udemy.BinarySearch;

public class Test {
    public static void main (String[] args){
        int[] massive = new int[] {1,2,4,5,6,6,6,7,8,9};

        System.out.println(countIncluz(massive, 12));


    }

    public static int getFirstIndex(int[]massive, int target){
        int left = 0;
        int right = massive.length;
        while(left < right){
            int m = (left + right) / 2;
            boolean check = checkerFirst(massive, m, target);
            if(check){
                right = m;
            }else{
                left = m + 1;
            }
        }
        return left;

    }
    public static int getSecondIndex(int[]massive, int target){
        int left = 0;
        int right = massive.length;
        while(left < right){
            int m = (left + right) / 2;
            boolean check = checkerSecond(massive, m, target);
            if(check){
                right = m;
            }else{
                left = m + 1;
            }
        }
        return right;

    }
    public static boolean checkerFirst(int[] massive, int m, int target){
        return massive[m] >= target;
    }
    public static boolean checkerSecond(int[] massive, int m, int target){
        return massive[m] > target;
    }
    public static int countIncluz(int[]massive, int target){
        return (getSecondIndex(massive,target) - getFirstIndex(massive, target));
    }


}
