package IDTV.javaprofessional.unit8.aonnatations;

import IDTV.javaprofessional.unit8.aonnatations.anno.RepeatMathAnno;
import IDTV.javaprofessional.unit8.aonnatations.anno.Sum;
import IDTV.javaprofessional.unit8.aonnatations.dispatch.Summing;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestAnno {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        /*
        * non repeatable anno
        * */
        System.out.println("First example: \n");
        Class<?> cl = Summing.class;
        Summing summing = new Summing();
        Method method = cl.getDeclaredMethod("summarize", int.class, int.class);
        Sum s = method.getAnnotation(Sum.class);
        summing.summarize(s.value1(), s.value2());

        System.out.println("Second example: \n");

        Class<?> cl2 = Summing.class;
        Summing summing1 = new Summing();
        Method method1 = cl2.getDeclaredMethod("summarize2",int[].class);

        RepeatMathAnno[] annotations = method1.getAnnotationsByType(RepeatMathAnno.class);
        int [] values = new int[annotations.length];
        for (int i = 0; i < annotations.length; i++) {
            values[i] = annotations[i].value();
        }
        summing1.summarize2(values);


    }
}
