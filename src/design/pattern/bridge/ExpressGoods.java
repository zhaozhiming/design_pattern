package design.pattern.bridge;

public class ExpressGoods extends Goods {
    public ExpressGoods(Transport transport) {
        super(transport);
    }

    public String speedUp() {
        return "运输加速，";
    }

    @Override
    public String transport() {
        return speedUp() + super.transport();
    }
}
