package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;

public class ChanelTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Documents\\Власевский\\Учёба\\Algorithms\\AlgorithmsYa\\pom.xml");
        FileOutputStream fos = new FileOutputStream("copy.txt");

        FileChannel inputChannel = fis.getChannel();
        FileChannel outputChannel = fos.getChannel();
        ByteBuffer bufferInput = ByteBuffer.allocate(4096);
        ByteBuffer bufferOutput = ByteBuffer.allocate(4096);

        int r = inputChannel.read(bufferInput);
        while (r != -1){
            bufferInput.flip(); // перевод буфера в режим чтения
            while (bufferInput.hasRemaining()){ //пока в буфере что-то есть, мы хотим из него читать
                bufferOutput.put(bufferInput.get());
            }
            outputChannel.write(bufferOutput);
            bufferInput.clear(); // почистить буфер
        }
        fis.close();
        fos.close();
    }
}
