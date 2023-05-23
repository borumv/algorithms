package IDTV.javaprofessional.unit7;

import com.sun.jdi.Accessible;

import java.lang.reflect.AccessibleObject;

public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException {
        ReflectionTest reflectionTest = new ReflectionTest();
        System.out.println(reflectionTest.getClass());
        System.out.println(ReflectionTest.class);
        Integer i = 5;
        System.out.println(i.getClass());
        System.out.println(Class.forName("java.lang.String"));
        System.out.println(Class.forName("[I"));
        System.out.println(Integer.class.getSuperclass());
        System.out.println(Integer.class.getEnclosingClass());
        System.out.println(int.class);
        int i2 = 5;

    }
}
