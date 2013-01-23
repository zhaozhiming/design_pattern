package design.pattern.abstracted.factory;

import design.pattern.abstracted.factory.factory.ApplePhoneFactory;
import design.pattern.abstracted.factory.cpu.SamsungPhoneFactory;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClientTest {

    @Test
    public void should_create_apple_phone_correct() {
        Client client = new Client(new ApplePhoneFactory());
        Phone phone = client.createPhone();
        assertThat(phone.getModel().getMessage(), is("IPhone5"));
        assertThat(phone.getCpu().getGHz(), is("2GHz"));
        assertThat(phone.getOperatingSystem().getName(), is("iOS"));
    }

    @Test
    public void should_create_samsung_phone_correct() {
        Client client = new Client(new SamsungPhoneFactory());
        Phone phone = client.createPhone();
        assertThat(phone.getModel().getMessage(), is("GALAXY III"));
        assertThat(phone.getCpu().getGHz(), is("2.4GHz"));
        assertThat(phone.getOperatingSystem().getName(), is("android"));
    }
}
