package ClassLoader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Objects;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
      String path =   ClassLoader.getSystemClassLoader().getResource("application.properties").getPath();
        Stream<String> lines = new BufferedReader(new FileReader(path)).lines();
        lines.forEach(System.out::println);
    }
}