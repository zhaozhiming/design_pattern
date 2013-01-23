package design.pattern.builder;

import static java.util.Arrays.asList;

public class Client {
    public Order createOrderOne() {
        return OrderBuilder.aOrder().buildId(1).buildCustomer("张三")
                .buildProducts(asList(new Product("电脑", 5000d)))
                .build();
    }

    public Order createOrderTwo() {
        return OrderBuilder.aOrder().buildId(2).buildCustomer("李四")
                .buildProducts(asList(new Product("化妆品", 80d), new Product("衣服", 500d)))
                .build();
    }
}
