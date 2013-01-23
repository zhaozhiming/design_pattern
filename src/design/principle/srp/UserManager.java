package design.principle.srp;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users = new ArrayList<User>();

    public void addUser(User user) {
        users.add(user);
    }
}
