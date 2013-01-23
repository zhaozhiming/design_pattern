package design.pattern.proxy.demo;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("real subject request");
    }
}
