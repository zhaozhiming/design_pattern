package design.pattern.mediator;

public abstract class Mediator {

    protected Seller seller;
    protected Logistics logistics;
    protected Buyer buyer;

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public void setLogistics(Logistics logistics) {
        this.logistics = logistics;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public abstract String logisticsSend();

    public abstract String buyerPay();

    public abstract String getSellerProductInfo();

    public abstract String getBuyerAddress();

    public abstract String selectSellerProduct();

    public abstract String selectLogisticsCompany();
}
