package design.pattern.strategy.demo;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());
        context.contextInterface();

        System.out.println();
        context.setStrategy(new ConcreteStrategyB());
        context.contextInterface();

        System.out.println();
        context.setStrategy(new ConcreteStrategyC());
        context.contextInterface();
    }
}
