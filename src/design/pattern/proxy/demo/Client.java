package design.pattern.proxy.demo;

public class Client {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        realSubject.request();

        Proxy proxy = new Proxy(realSubject);
        proxy.request();
    }
}
