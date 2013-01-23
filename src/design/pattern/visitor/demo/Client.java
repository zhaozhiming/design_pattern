package design.pattern.visitor.demo;

public class Client {
    public static void main(String[] args) {
        Element elementA = new ConcreteElementA();
        Element elementB = new ConcreteElementB();
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addElement(elementA);
        objectStructure.addElement(elementB);

        Visitor visitor1 = new ConcreteVisitor1();
        objectStructure.visit(visitor1);

        System.out.println();
        Visitor visitor2 = new ConcreteVisitor2();
        objectStructure.visit(visitor2);
    }
}
