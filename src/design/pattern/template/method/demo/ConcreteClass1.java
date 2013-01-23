package design.pattern.template.method.demo;

public class ConcreteClass1 extends AbstractClass {
    @Override
    protected void primitiveOperation1() {
        System.out.println("concrete class 1 operation1");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("concrete class 1 operation2");
    }
}
