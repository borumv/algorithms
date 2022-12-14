package IDTV.javaprofessional.unit3;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class SimplePrintWriter {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));
    }
}
