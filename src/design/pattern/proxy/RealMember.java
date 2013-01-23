package design.pattern.proxy;

import java.util.ArrayList;
import java.util.List;

public class RealMember implements Member {
    private String name;
    private String sex;
    private String interest;
    private List<String> friendComments = new ArrayList<String>();


    public RealMember(String name) {
        this.name = name;
    }

    @Override
    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public void setInterest(String interest) {
        this.interest = interest;
    }

    @Override
    public String getInterest() {
        return interest;
    }

    @Override
    public void addFriendComment(String friendComment) {
        friendComments.add(friendComment);
    }

    @Override
    public List<String> getFriendComments() {
        return friendComments;
    }

    public String getName() {
        return name;
    }
}
