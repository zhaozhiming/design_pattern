package design.pattern.bridge.demo;

public class Client {
    public static void main(String[] args) {
        Abstraction abstraction = new Abstraction(new ConcreteImplementA());
        abstraction.operation();

        RefinedAbstraction refinedAbstraction = new RefinedAbstraction(new ConcreteImplementB());
        refinedAbstraction.operation();
    }
}
