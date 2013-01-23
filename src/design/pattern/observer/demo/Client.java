package design.pattern.observer.demo;

public class Client {
    public static void main(String[] args) {
        ConcreteObserver observer = new ConcreteObserver();

        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.addObserver(observer);

        concreteSubject.setSubjectState("new");
    }
}
