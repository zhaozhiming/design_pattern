package design.pattern.bridge;

public class Goods {
    private Transport transport;

    public Goods(Transport transport) {
        this.transport = transport;
    }

    public String transport() {
        return transport.transport();
    }
}
