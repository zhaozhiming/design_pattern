package design.pattern.decorator.demo;

public class ConcreteDecoratorA extends Decorator {
    private String addedState;

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("add state is " + addedState);
    }

    public void setAddedState(String addedState) {
        this.addedState = addedState;
    }
}
