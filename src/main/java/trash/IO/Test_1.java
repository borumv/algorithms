package trash.IO;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Test_1 {
    public static void main(String[] args) throws Exception {
        readerWithBuffer();
    }

    public static void InputOutput(){
        try(InputStream is = new FileInputStream("C:\\Users\\Admin\\Documents\\Власевский\\Учёба\\ans.docx");
            OutputStream os = new FileOutputStream("C:\\Users\\Admin\\Documents\\Власевский\\Учёба\\ans2.docx")){
            //int i = is.read(); так мы читаем по байтово - это не эффективно
            byte[] buffer = new byte[4096];
            int i = is.read(buffer);
            while (is.read() != -1){
                os.write(buffer, 0, i);
                i = is.read(buffer);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readerWriter() throws IOException {
        try(FileReader fileReader = new FileReader("pom.xml");
            FileWriter fileWriter = new FileWriter("test.xml")){
            char[] chars = new char[4096];
            int i = fileReader.read(chars);
            while (i != -1){
                fileWriter.write(chars, 0, i);
                i = fileReader.read(chars);
            }
        }
    }

    public static void readerWithBuffer() throws Exception{
        try (InputStream fileInputStream = new FileInputStream("pom.xml")) {
            Reader reader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(reader);
            while (bufferedReader.readLine() != null){
                System.out.println(bufferedReader.readLine());
            }
        }
    }


}
