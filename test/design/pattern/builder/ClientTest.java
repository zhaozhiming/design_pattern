package design.pattern.builder;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClientTest {
    @Test
    public void should_create_order_1_correct() {
        Client client = new Client();
        Order order = client.createOrderOne();
        assertThat(order.getId(), is(1));
        assertThat(order.getCustomer(), is("张三"));
        assertThat(order.getProducts().size(), is(1));
        assertThat(order.getTotalAmount(), is(5000d));
    }

    @Test
    public void should_create_order_2_correct() {
        Client client = new Client();
        Order order = client.createOrderTwo();
        assertThat(order.getId(), is(2));
        assertThat(order.getCustomer(), is("李四"));
        assertThat(order.getProducts().size(), is(2));
        assertThat(order.getTotalAmount(), is(580d));
    }
}
