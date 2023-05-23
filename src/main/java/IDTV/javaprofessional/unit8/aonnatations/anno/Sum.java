package IDTV.javaprofessional.unit8.aonnatations.anno;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Sum {
    int value1() default 0;
    int value2() default 0;
 }
