package design.pattern.builder;

import java.util.List;

public class Order {
    private int id;
    private String customer;
    private List<Product> products;

    public Order(int id, String customer, List<Product> products) {
        this.id = id;
        this.customer = customer;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public String getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalAmount() {
        double total = 0;
        for (Product product : products) {
            total += product.getAmount();
        }
        return total;
    }
}
