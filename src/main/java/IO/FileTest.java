package IO;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file =new File("src/main/java/IO");
        System.out.println(file.getAbsolutePath());
        String[] list =file.list((dir, name) -> name.startsWith("Read"));
        for (String s : list) {
            System.out.println(s);
        }
    }
}
