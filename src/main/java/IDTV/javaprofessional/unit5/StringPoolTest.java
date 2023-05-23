package IDTV.javaprofessional.unit5;

public class StringPoolTest {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";

        String c = new String("hello");
        String d = new String("hello");

        System.out.println(a==b);
        System.out.println(c==b);
        System.out.println(c==d);


        System.out.println("AFTER INTERN");
        System.out.println(a==b);
        System.out.println(c.intern()==b);
        System.out.println(c.intern()==d.intern());


        System.out.printf("%.2F", 22.3412412424);

    }
}
