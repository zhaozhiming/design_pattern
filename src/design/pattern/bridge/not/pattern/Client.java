package design.pattern.bridge.not.pattern;

public class Client {
    public static void main(String[] args) {
        Goods goods = new CommonGoodsAirDelivery();
        String message = goods.transport();
        System.out.println(message);

        goods = new ExpressGoodsTrainDelivery();
        String expressMessage = goods.transport();
        System.out.println(expressMessage);

    }
}
