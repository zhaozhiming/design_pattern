package design.pattern.factory.method;

public class Client {
    private Factory factory;

    public Client(Factory factory) {
        this.factory = factory;
    }

    public String useProduct(String type) {
        Product product = factory.create(type);
        return product.use();
    }

}
