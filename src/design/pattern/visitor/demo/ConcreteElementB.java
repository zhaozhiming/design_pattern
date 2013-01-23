package design.pattern.visitor.demo;

public class ConcreteElementB implements Element {

    public void operationB() {
        System.out.println("concrete element B operation B");
    }

    public void otherOperationB() {
        System.out.println("concrete element B other operation B");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }
}
