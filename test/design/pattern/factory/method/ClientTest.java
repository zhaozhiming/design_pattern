package design.pattern.factory.method;

import design.pattern.factory.method.computer.ComputerFactory;
import design.pattern.factory.method.phone.PhoneFactory;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClientTest {

    @Test
    public void should_use_phone_correct() {
        Client client = new Client(new PhoneFactory());
        assertThat(client.useProduct("Apple"), is("IPhone call"));
        assertThat(client.useProduct("Samsung"), is("Samsung phone call"));
        assertThat(client.useProduct("Windows"), is("Windows phone call"));
    }

    @Test
    public void should_use_computer_correct() {
        Client client = new Client(new ComputerFactory());
        assertThat(client.useProduct("Apple"), is("Mac computer run"));
        assertThat(client.useProduct("Samsung"), is("Samsung computer run"));
        assertThat(client.useProduct("Windows"), is("Windows computer run"));
    }

}
