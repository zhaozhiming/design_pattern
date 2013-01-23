package design.pattern.bridge;

public class Client {
    public String invoke(Goods goods) {
        return goods.transport();
    }
}
