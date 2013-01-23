package design.pattern.visitor.demo;

public class ConcreteElementA implements Element {
    public void operationA() {
        System.out.println("concrete element A operation A");
    }

    public void otherOperationA() {
        System.out.println("concrete element A other operation A");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }
}
