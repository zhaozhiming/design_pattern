package design.pattern.decorator.demo;

public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    public void addedBehavior() {
        System.out.println("add behave");
    }

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }
}
