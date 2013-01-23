package design.pattern.strategy.demo;

public class ConcreteStrategyA implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("concrete strategy A algorithm");
    }
}
