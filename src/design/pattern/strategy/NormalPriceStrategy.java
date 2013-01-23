package design.pattern.strategy;

public class NormalPriceStrategy implements PriceStrategy {
    @Override
    public double calc(double price) {
        return price;
    }
}
