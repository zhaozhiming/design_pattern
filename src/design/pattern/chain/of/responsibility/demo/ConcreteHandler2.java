package design.pattern.chain.of.responsibility.demo;

public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest() {
        if (successor != null) {
            successor.handleRequest();
            return;
        }

        System.out.println("concrete handler 2 handled");
    }
}
