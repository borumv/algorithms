package IDTV.javaprofessional.unit3;

import java.io.ByteArrayInputStream;
import java.util.LinkedList;
import java.util.Set;

public class SimpleByteArrayInputStram {
    public static void main(String[] args) {
//        byte[] arg = new byte[]{1, 3, 5, 7};
//        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arg);
//        int tmp;
//        while ((tmp = byteArrayInputStream.read()) != -1){
//            System.out.println(tmp);
//        }

        System.out.println("12 - " + new Integer(12).byteValue());
        String str = "Hello";
        byte[]arr2 = str.getBytes();
        ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(arr2, 1,3);
        int tmp2;
        while ((tmp2 = byteArrayInputStream1.read()) != -1){
            System.out.println(tmp2);
        }
    }
}
