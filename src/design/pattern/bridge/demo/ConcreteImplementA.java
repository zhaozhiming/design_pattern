package design.pattern.bridge.demo;

public class ConcreteImplementA implements Implementor {
    @Override
    public void operationImp() {
        System.out.println("实现部分的具体实现A");
    }
}
