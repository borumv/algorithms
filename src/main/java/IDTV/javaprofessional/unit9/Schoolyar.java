package IDTV.javaprofessional.unit9;

import java.io.Serializable;

public class Schoolyar extends Student implements Serializable {
    private int age;

    public Schoolyar(int id, String name, long password, int age) {
        super(id, name, password);
        this.age = age;
    }
}
