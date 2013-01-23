package design.pattern.factory.method.phone;

public class SamsungPhone implements Phone {
    @Override
    public String use() {
        return "Samsung phone call";
    }
}
