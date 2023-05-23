package IDTV.javaprofessional.unit8;

public class VarargsTest {

    public int sum(int... args){
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }
    public static void main(String[] args) {
        VarargsTest v = new VarargsTest();
        System.out.println(v.sum(1,2,34,45));
        System.out.println(v.sum(1,2,34,45,234));
        System.out.println(v.sum(1,2));
        System.out.println(v.sum(1,2,34,45));
        System.out.println(v.sum());

    }
}
