package design.pattern.decorator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClientTest {
    @Test
    public void should_show_rent_message_when_given_small_house() {
        House house = new SmallHouse("XX路XX号", 1000);
        String message = house.rent();
        assertThat(message, is("地址:XX路XX号,每月房租1000"));
    }

    @Test
    public void should_show_rent_message_when_given_small_house_with_lift() {
        House house = new SmallHouse("XX路XX号", 1000);
        HouseDecorator decorator = new Lift(house);
        String message = decorator.rent();
        assertThat(message, is("有电梯,地址:XX路XX号,每月房租1100"));
    }
}
