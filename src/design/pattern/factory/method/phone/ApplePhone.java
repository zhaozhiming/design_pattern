package design.pattern.factory.method.phone;

public class ApplePhone implements Phone {
    @Override
    public String use() {
        return "IPhone call";
    }
}
