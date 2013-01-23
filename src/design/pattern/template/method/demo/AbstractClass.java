package design.pattern.template.method.demo;

public abstract class AbstractClass {

    public void templateMethod() {
        System.out.println("template method start");
        primitiveOperation1();
        System.out.println("template method running");
        primitiveOperation2();
        System.out.println("template method end");
    }

    protected abstract void primitiveOperation1();

    protected abstract void primitiveOperation2();
}
