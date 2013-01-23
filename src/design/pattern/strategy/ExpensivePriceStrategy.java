package design.pattern.strategy;

public class ExpensivePriceStrategy implements PriceStrategy {
    @Override
    public double calc(double price) {
        return price * 1.2;
    }
}
