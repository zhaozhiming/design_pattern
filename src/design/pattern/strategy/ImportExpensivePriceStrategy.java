package design.pattern.strategy;

public class ImportExpensivePriceStrategy implements PriceStrategy {
    @Override
    public double calc(double price) {
        return price * 1.1 * 1.2;
    }
}
