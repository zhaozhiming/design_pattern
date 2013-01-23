package design.pattern.flyweight;

import java.util.ArrayList;
import java.util.List;

public class RoleGroup implements Role{
    private List<Role> roles = new ArrayList<Role>();

    RoleGroup() {
    }

    @Override
    public String login(String username) {
        StringBuilder message = new StringBuilder();
        for (Role role : roles) {
            message.append(role.login(username)).append("\n");
        }
        return message.toString();
    }

    public void addRole(Role role) {
        roles.add(role);
    }
}
