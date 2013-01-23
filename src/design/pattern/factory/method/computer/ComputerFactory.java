package design.pattern.factory.method.computer;

import design.pattern.factory.method.Factory;
import design.pattern.factory.method.Product;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ComputerFactory implements Factory {
    @Override
    public Product create(String type) {
        try {
            File configFile = new File("config/computer.properties");
            Properties properties = new Properties();
            properties.load(new FileInputStream(configFile));
            String computerClassName = properties.getProperty(type);
            return (Computer) Class.forName(computerClassName).newInstance();
        } catch (Exception e) {
            throw new RuntimeException("create error");
        }
    }
}
