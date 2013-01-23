package design.pattern.bridge.not.pattern;

public class ExpressGoodsAirDelivery implements ExpressGoods {
    @Override
    public String speedUp() {
        return "运输加速，";
    }

    @Override
    public String transport() {
        return speedUp() + "使用飞机运输货物";
    }
}
