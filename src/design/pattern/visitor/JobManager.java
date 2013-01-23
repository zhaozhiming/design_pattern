package design.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class JobManager {
    private List<User> users = new ArrayList<User>();

    public void addUser(User user) {
        users.add(user);
    }

    public int getUserCount() {
        return users.size();
    }

    public String visitUserInfo(Visitor visitor) {
        StringBuilder message = new StringBuilder();
        for (User user : users) {
            message.append(user.accept(visitor)).append("\n");
        }

        return message.toString();
    }
}
