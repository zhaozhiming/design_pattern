package design.pattern.builder;

import java.util.List;

public class OrderBuilder {
    private int id;
    private String customer;
    private List<Product> products;

    public static OrderBuilder aOrder() {
        return new OrderBuilder();
    }

    public OrderBuilder buildId(int id) {
        this.id = id;
        return this;
    }

    public OrderBuilder buildCustomer(String customer) {
        this.customer = customer;
        return this;
    }

    public OrderBuilder buildProducts(List<Product> products) {
        this.products = products;
        return this;
    }

    public Order build() {
        return new Order(id, customer, products);
    }
}
