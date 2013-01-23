package design.pattern.observer.demo;

public class ConcreteObserver implements Observer {
    private String observerState;

    @Override
    public void update(Subject subject) {
        observerState = subject.getState();
        System.out.println("concrete observer state is " + observerState);
    }
}
