package design.pattern.bridge;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClientTest {

    private Client client;

    @Before
    public void setUp() throws Exception {
        client = new Client();
    }

    @Test
    public void should_transport_common_good_by_train_correct() throws Exception {
        String message = client.invoke(new Goods(new TrainTransport()));
        assertThat(message, is("使用火车运输货物"));
    }

    @Test
    public void should_transport_express_goods_by_air_correct() throws Exception {
        String message = client.invoke(new ExpressGoods(new AirTransport()));
        assertThat(message, is("运输加速，使用飞机运输货物"));
    }
}
