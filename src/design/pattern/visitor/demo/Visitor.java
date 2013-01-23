package design.pattern.visitor.demo;

public interface Visitor {
    void visitConcreteElementA(ConcreteElementA concreteElementA);

    void visitConcreteElementB(ConcreteElementB concreteElementB);
}
