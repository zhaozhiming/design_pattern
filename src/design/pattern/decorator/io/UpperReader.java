package design.pattern.decorator.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class UpperReader extends BufferedReader {
    public UpperReader(Reader in) {
        super(in);
    }

    @Override
    public String readLine() throws IOException {
        String line = super.readLine();
        return line.toUpperCase();
    }
}
