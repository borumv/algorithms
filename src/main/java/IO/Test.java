package IO;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Admin\\Documents\\new.txt";
        System.out.write(4);
        File file = new File(path);
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
        System.out.println(file.getAbsoluteFile());


        System.out.println(file.canWrite() ? "write" : "not write");
        System.out.println("Total space - " + file.getTotalSpace()/Math.pow(10, 9) + "GB");

    }
}
