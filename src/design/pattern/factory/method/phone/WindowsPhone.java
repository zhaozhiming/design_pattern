package design.pattern.factory.method.phone;

public class WindowsPhone implements Phone {
    @Override
    public String use() {
        return "Windows phone call";
    }
}
