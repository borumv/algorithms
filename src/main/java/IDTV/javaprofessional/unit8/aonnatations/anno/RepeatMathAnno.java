package IDTV.javaprofessional.unit8.aonnatations.anno;


import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(MathAnno.class)
public @interface RepeatMathAnno {
    int value() default 5;
}
