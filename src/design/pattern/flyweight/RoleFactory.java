package design.pattern.flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoleFactory {
    private static RoleFactory roleFactory;
    private Map<String, Role> roles = new HashMap<String, Role>();

    private RoleFactory() {
    }

    public synchronized static RoleFactory getInstance() {
        if (roleFactory == null) {
            roleFactory = new RoleFactory();
        }
        return roleFactory;
    }

    public Role getRole(String roleName) {
        if (roles.containsKey(roleName)) {
            return roles.get(roleName);
        }

        try {
            Role role = (Role) Class.forName("design.pattern.flyweight."
                    + roleName).newInstance();
            roles.put(roleName, role);
            return role;
        } catch (Exception e) {
            throw new RuntimeException("获取角色失败");
        }
    }

    public Role getRole(List<String> roleNames) {
        RoleGroup roleGroup = new RoleGroup();
        for (String roleName : roleNames) {
            Role role = getRole(roleName);
            roleGroup.addRole(role);
        }
        return roleGroup;
    }
}
