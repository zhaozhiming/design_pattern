package design.pattern.strategy;

public class ImportPriceStrategy implements PriceStrategy {
    @Override
    public double calc(double price) {
        return price * 1.1;
    }
}
