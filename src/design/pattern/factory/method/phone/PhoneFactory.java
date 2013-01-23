package design.pattern.factory.method.phone;

import design.pattern.factory.method.Factory;
import design.pattern.factory.method.Product;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PhoneFactory implements Factory {
    public Product create(String type) {
        try {
            File configFile = new File("config/phone.properties");
            Properties properties = new Properties();
            properties.load(new FileInputStream(configFile));
            String phoneClassName = properties.getProperty(type);
            return (Phone) Class.forName(phoneClassName).newInstance();
        } catch (Exception e) {
            throw new RuntimeException("create error");
        }
    }
}
