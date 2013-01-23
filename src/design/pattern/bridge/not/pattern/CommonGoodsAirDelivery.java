package design.pattern.bridge.not.pattern;

public class CommonGoodsAirDelivery implements Goods {
    @Override
    public String transport() {
        return "使用飞机运输货物";
    }
}
