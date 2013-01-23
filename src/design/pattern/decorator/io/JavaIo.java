package design.pattern.decorator.io;

import java.io.*;

public class JavaIo {
    public static void main(String[] args) throws IOException {
        File file = new File("config/phone.properties");
        UpperReader reader = new UpperReader(new FileReader(file));

        String line = reader.readLine();
        System.out.println(line);

        reader.close();
    }
}
