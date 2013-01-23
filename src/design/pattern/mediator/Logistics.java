package design.pattern.mediator;

public class Logistics extends Colleague {

    public Logistics(Mediator mediator) {
        super(mediator);
    }

    public String send() {
        return "通过物流公司发送货物";
    }

    public String getLogisticsInfo() {
        StringBuilder message = new StringBuilder();
        message.append(mediator.getSellerProductInfo());
        message.append("\n");
        message.append(mediator.getBuyerAddress());
        return message.toString();
    }

    public String selectCompany() {
        return "选择物流公司";
    }
}
