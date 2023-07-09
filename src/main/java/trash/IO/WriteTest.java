package trash.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteTest {
    public static void main(String[] args) {
        String text = "somesdds text";
        byte[] input = text.getBytes();

        try(FileOutputStream stream = new FileOutputStream(text);) {
            for(byte f : input){
                stream.write(f);
            }
        } catch (IOException e) {
            System.out.println("IO EXCEPTION");
        }
    }
}
