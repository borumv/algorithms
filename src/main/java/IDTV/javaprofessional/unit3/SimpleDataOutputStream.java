package IDTV.javaprofessional.unit3;

import java.io.*;

public class SimpleDataOutputStream {
    public static void main(String[] args) {

        try(DataOutputStream ds = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("text.txt")));
            DataInputStream di = new DataInputStream(new BufferedInputStream(new FileInputStream("text.txt")))) {
            ds.writeByte(1);
            ds.writeInt(1234);
            ds.writeUTF("Hello!");
            ds.flush();
            System.out.println(di.readByte());
            System.out.println(di.readInt());
            System.out.println(di.readUTF());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
