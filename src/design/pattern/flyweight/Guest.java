package design.pattern.flyweight;

public class Guest implements Role {
    private String roleName = "游客";

    Guest() {
    }

    @Override
    public String login(String username) {
        return username + "以" + roleName + "身份登录，只有普通用户权限";
    }
}
