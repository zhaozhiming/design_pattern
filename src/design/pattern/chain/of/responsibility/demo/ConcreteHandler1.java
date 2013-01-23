package design.pattern.chain.of.responsibility.demo;

public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest() {
        if (successor != null) {
            successor.handleRequest();
            return;
        }

        System.out.println("concrete handler 1 handled");
    }
}
