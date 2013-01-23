package design.pattern.visitor.demo;

public class ConcreteVisitor2 implements Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        concreteElementA.otherOperationA();
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        concreteElementB.otherOperationB();
    }
}
