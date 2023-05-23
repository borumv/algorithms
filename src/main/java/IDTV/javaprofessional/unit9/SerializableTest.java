package IDTV.javaprofessional.unit9;

import java.io.*;

public class SerializableTest {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\Documents\\Власевский\\Учёба\\Algorithms\\AlgorithmsYa\\src\\main\\java\\IDTV\\javaprofessional\\unit9\\test.txt");
        try (
                ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file));
                ObjectInputStream is = new ObjectInputStream(new FileInputStream(file));
                ){
            Schoolyar student = new Schoolyar(1,"boris", 123, 44);
            os.writeObject(student);
            is.readObject();
            System.out.println(student);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
