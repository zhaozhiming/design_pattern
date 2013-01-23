package design.pattern.flyweight;

public class Admin implements Role {
    private String roleName = "管理员";

    Admin() {
    }

    @Override
    public String login(String username) {
        return username + "以" + roleName + "身份登录，拥有超级用户权限";
    }
}
