package design.pattern.factory.method.computer;

public class WindowsComputer implements Computer {
    @Override
    public String use() {
        return "Windows computer run";
    }
}
