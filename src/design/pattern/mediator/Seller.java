package design.pattern.mediator;

public class Seller extends Colleague {

    public Seller(Mediator mediator) {
        super(mediator);
    }

    public String sell() {
        StringBuilder message = new StringBuilder();
        message.append(mediator.logisticsSend());
        message.append("\n");
        message.append(mediator.buyerPay());
        return message.toString();
    }

    public String getProductInfo() {
        return "获取产品的信息";
    }

    public String selectProduct() {
        return "选择卖家的产品";
    }
}
