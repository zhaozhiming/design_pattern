package design.pattern.template.method.demo;

public class ConcreteClass2 extends AbstractClass {
    @Override
    protected void primitiveOperation1() {
        System.out.println("concrete class 2 operation1");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("concrete class 2 operation2");
    }
}
