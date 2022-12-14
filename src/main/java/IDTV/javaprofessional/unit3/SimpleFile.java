package IDTV.javaprofessional.unit3;

import java.io.File;

public class SimpleFile {
    public static void main(String[] args) {
        String path = "SimpleErr";
        File file = new File(path);
        System.out.println(file.isFile());
        System.out.println(file.getName());
        System.out.println(file.length());
    }
}
