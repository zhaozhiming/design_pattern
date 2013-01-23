package design.pattern.mediator;

public class Buyer extends Colleague {

    public Buyer(Mediator mediator) {
        super(mediator);
    }

    public String pay() {
        return "买家付款";
    }

    public String getAddress() {
        return "获取买家的地址";
    }

    public String order() {
        StringBuilder message = new StringBuilder();
        message.append(mediator.selectSellerProduct());
        message.append("\n");
        message.append(mediator.selectLogisticsCompany());
        return message.toString();
    }
}
