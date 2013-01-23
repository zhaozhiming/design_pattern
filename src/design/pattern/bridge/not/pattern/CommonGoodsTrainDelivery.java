package design.pattern.bridge.not.pattern;

public class CommonGoodsTrainDelivery implements Goods {
    @Override
    public String transport() {
        return "使用火车运输货物";
    }
}
