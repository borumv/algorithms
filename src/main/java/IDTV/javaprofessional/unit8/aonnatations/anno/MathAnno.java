package IDTV.javaprofessional.unit8.aonnatations.anno;


import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface MathAnno {
    RepeatMathAnno [] value();
}
