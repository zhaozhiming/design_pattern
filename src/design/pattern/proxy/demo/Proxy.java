package design.pattern.proxy.demo;

public class Proxy implements Subject {
    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        System.out.print("proxy request first, ");
        this.realSubject.request();
    }
}
