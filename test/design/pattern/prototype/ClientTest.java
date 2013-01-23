package design.pattern.prototype;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClientTest {
    @Test
    public void should_show_position_message_when_individual_user_login() {
        Client client = new Client();
        String message = client.login(new IndividualUser(), "张三");
        assertThat(message, is("欢迎您,个人用户:张三\n" +
                "职位:\n" +
                "初级开发,甲公司,5000RMB\n" +
                "资深开发,乙公司,10000RMB\n" +
                "架构师,丙公司,15000RMB"));
    }

    @Test
    public void should_show_welcome_message_when_enterprise_user_login() {
        Client client = new Client();
        String message = client.login(new EnterpriseUser(), "学云网");
        assertThat(message, is("欢迎您,企业用户:学云网"));
    }

    @Test
    public void should_show_enterprise_user_position_message_correct() throws CloneNotSupportedException {
        Position position = new Position("架构师");
        System.out.println(position);
        EnterpriseUser enterpriseUser = new EnterpriseUser();
        enterpriseUser.setPosition(position);
        EnterpriseUser clone = (EnterpriseUser) enterpriseUser.clone();
        Position clonePosition = clone.getPosition();
        System.out.println(clonePosition);
    }
}
