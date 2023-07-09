package trash.IO;

import java.io.File;

public class DirectoryTest {
    public static void main(String[] args) {
        File directory = new File("src/backup");
        if(!directory.exists()){
            System.out.println(directory.mkdir() ? "succesfully" : "is not succesfully");
        }else {
            System.out.println("directory exists");
        }
    }
}
