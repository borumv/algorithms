package IO;

import java.io.*;

public class MusicCLoner {
    public static void main(String[] args) throws FileNotFoundException {
        try(
                InputStream inputStream = new FileInputStream("C:\\Users\\Admin\\Documents\\Stolovaya_1.mp4");
                OutputStream outputStream = new FileOutputStream("C:\\Users\\Admin\\Documents\\Stolovaya_1-copy.mp4", true)) {
            byte[] bytes = new byte[4094];
            int reading = inputStream.read(bytes);
            while (reading != -1){
                outputStream.write(bytes, 0, reading);
                reading = inputStream.read(bytes);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }




}
