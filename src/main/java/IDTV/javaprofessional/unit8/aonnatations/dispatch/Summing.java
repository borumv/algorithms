package IDTV.javaprofessional.unit8.aonnatations.dispatch;

import IDTV.javaprofessional.unit8.aonnatations.anno.RepeatMathAnno;
import IDTV.javaprofessional.unit8.aonnatations.anno.Sum;

public class Summing {

    @Sum(value1 = 10, value2 = 20)
    public void summarize(int i, int b){
        System.out.println("Sum - "  + (i + b));
    }

    @RepeatMathAnno(11)
    @RepeatMathAnno(12)
    public void summarize2(int[] args){
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        System.out.println("Sum =  " + sum);
    }
}
