package design.pattern.flyweight;

import org.junit.Before;
import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClientTest {

    private RoleFactory roleFactory;

    @Before
    public void setUp() throws Exception {
        roleFactory = RoleFactory.getInstance();
    }

    @Test
    public void should_return_login_message_when_guest_login() {
        Role role = roleFactory.getRole("Guest");
        String message = role.login("张三");
        assertThat(message, is("张三以游客身份登录，只有普通用户权限"));
    }

    @Test
    public void should_return_login_message_when_admin_login() {
        Role role = roleFactory.getRole("Admin");
        String message = role.login("李四");
        assertThat(message, is("李四以管理员身份登录，拥有超级用户权限"));
    }

    @Test
    public void should_return_login_message_when_role_group_login() {
        Role role = roleFactory.getRole(asList("Guest", "Admin"));
        String message = role.login("王五");
        assertThat(message, is("王五以游客身份登录，只有普通用户权限\n王五以管理员身份登录，拥有超级用户权限\n"));
    }
}
