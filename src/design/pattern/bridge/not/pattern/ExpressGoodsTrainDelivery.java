package design.pattern.bridge.not.pattern;

public class ExpressGoodsTrainDelivery implements ExpressGoods {
    @Override
    public String speedUp() {
        return "运输加速，";
    }

    @Override
    public String transport() {
        return speedUp() + "使用火车运输货物";
    }
}
