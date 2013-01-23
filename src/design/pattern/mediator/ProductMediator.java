package design.pattern.mediator;

public class ProductMediator extends Mediator {
    @Override
    public String logisticsSend() {
        return logistics.send();
    }

    @Override
    public String buyerPay() {
        return buyer.pay();
    }

    @Override
    public String getSellerProductInfo() {
        return seller.getProductInfo();
    }

    @Override
    public String getBuyerAddress() {
        return buyer.getAddress();
    }

    @Override
    public String selectSellerProduct() {
        return seller.selectProduct();
    }

    @Override
    public String selectLogisticsCompany() {
        return logistics.selectCompany();
    }
}
