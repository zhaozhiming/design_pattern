package design.pattern.strategy;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClientTest {
    @Test
    public void should_calc_normal_product_price_correct() {
        Product product = new Product("笔记本电脑", 5000d);
        PriceStrategy priceStrategy = new NormalPriceStrategy();
        product.setPriceStrategy(priceStrategy);

        double price = product.calcPrice();
        assertThat(price, is(5000d));

        String message = product.toString();
        assertThat(message, is("商品名称 : 笔记本电脑, 价格 : 5000.00"));
    }

    @Test
    public void should_calc_import_product_price_correct() {
        Product product = new Product("进口香水", 2000d);
        PriceStrategy priceStrategy = new ImportPriceStrategy();
        product.setPriceStrategy(priceStrategy);

        double price = product.calcPrice();
        assertThat(price, is(2200d));

        String message = product.toString();
        assertThat(message, is("商品名称 : 进口香水, 价格 : 2200.00"));
    }

    @Test
    public void should_calc_expensive_product_price_correct() {
        Product product = new Product("高档乐器", 15000d);
        PriceStrategy priceStrategy = new ExpensivePriceStrategy();
        product.setPriceStrategy(priceStrategy);

        double price = product.calcPrice();
        assertThat(price, is(18000d));

        String message = product.toString();
        assertThat(message, is("商品名称 : 高档乐器, 价格 : 18000.00"));
    }

    @Test
    public void should_calc_import_expensive_product_price_correct() {
        Product product = new Product("高档进口乐器", 30000d);
        PriceStrategy priceStrategy = new ImportExpensivePriceStrategy();
        product.setPriceStrategy(priceStrategy);

        double price = product.calcPrice();
        assertThat(price, is(39600d));

        String message = product.toString();
        assertThat(message, is("商品名称 : 高档进口乐器, 价格 : 39600.00"));
    }
}
