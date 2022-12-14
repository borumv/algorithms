package IO;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileTest {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("somesdds text")){
            int symbol;

            while ((symbol = fileInputStream.read()) != -1){
                System.out.println((char) symbol);
            }
        }catch (IOException e){
            System.out.println("Error" + e.getMessage());
        }
    }
}
