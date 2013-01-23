package design.pattern.chain.of.responsibility.demo;

public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        handler1.handleRequest();

        System.out.println();
        Handler handler2 = new ConcreteHandler2();
        handler1.setSuccessor(handler2);
        handler1.handleRequest();

    }
}
