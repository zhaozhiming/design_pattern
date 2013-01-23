package design.pattern.decorator.demo;

public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();
        System.out.println();

        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA(component);
        decoratorA.setAddedState("new");
        decoratorA.operation();
        System.out.println();

        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB(decoratorA);
        decoratorB.operation();
    }
}
