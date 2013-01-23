package design.pattern.strategy;

public class Product {
    private String name;
    private double price;
    private PriceStrategy priceStrategy;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double calcPrice() {
        price = priceStrategy.calc(price);
        return price;
    }

    @Override
    public String toString() {
        return String.format("商品名称 : %s, 价格 : %.2f", name, price);
    }

    public void setPriceStrategy(PriceStrategy priceStrategy) {
        this.priceStrategy = priceStrategy;
    }
}
