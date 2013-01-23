package design.pattern.mediator;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClientTest {

    private Logistics logistics;
    private Seller seller;
    private Buyer buyer;

    @Before
    public void setUp() throws Exception {
        Mediator mediator = new ProductMediator();

        seller = new Seller(mediator);
        logistics = new Logistics(mediator);
        buyer = new Buyer(mediator);

        mediator.setSeller(seller);
        mediator.setLogistics(logistics);
        mediator.setBuyer(buyer);
    }

    @Test
    public void should_seller_sell_product_correct() {
        String message = seller.sell();
        assertThat(message, is("通过物流公司发送货物\n买家付款"));
    }

    @Test
    public void should_logistics_get_logistics_info_correct() {
        String message = logistics.getLogisticsInfo();
        assertThat(message, is("获取产品的信息\n获取买家的地址"));
    }

    @Test
    public void should_buyer_order_product_correct() {
        String message = buyer.order();
        assertThat(message, is("选择卖家的产品\n选择物流公司"));
    }
}
