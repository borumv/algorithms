package IDTV.javaprofessional.unit3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class SimpleErr {
    public static void main(String[] args) {

        try(InputStream inputStream = new FileInputStream("D:/");) {
            System.out.println(inputStream.read());
            System.out.println("file opened");
        } catch (FileNotFoundException e) {
            System.err.println("file opening failed");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
