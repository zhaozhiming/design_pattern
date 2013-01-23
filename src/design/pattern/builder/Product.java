package design.pattern.builder;

public class Product {
    private final String name;
    private final double amount;

    public Product(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
