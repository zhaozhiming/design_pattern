package design.pattern.proxy;

import java.util.List;

public interface Member {
    void setSex(String sex);

    String getSex();

    void setInterest(String interest);

    String getInterest();

    void addFriendComment(String friendComment);

    List<String> getFriendComments();
}
