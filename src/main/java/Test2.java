import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        String s = "string";
        Integer in = 2;
        Character ch = 'f';

        doDemoOne(s);
        doDemoOne(in);
        doDemoOne(ch);
        doDemoOne(new int[]{2123,3,45,5});


    }
    static void doDemoOne(Object o){
        switch(o){
            case String s -> System.out.println("it's String ->"  + s);
            case Integer i -> System.out.println("it's integer -> "  + i);
            case Character i -> System.out.println("it's caracter -> "  + i);
            case Long i -> System.out.println("it's Long -> " + i);

            default -> System.out.println("default method ->" + o.toString());
        }
    }
}
