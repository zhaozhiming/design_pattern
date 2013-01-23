package design.pattern.proxy;

import java.util.List;

public class MemberBodyguard implements Member {
    private RealMember realMember;
    private String operator;

    public MemberBodyguard(RealMember realMember, String operator) {
        this.realMember = realMember;
        this.operator = operator;
    }

    @Override
    public void setSex(String sex) {
        otherMemberSetShouldThrowException();
        this.realMember.setSex(sex);
    }

    @Override
    public String getSex() {
        return realMember.getSex();
    }

    @Override
    public void setInterest(String interest) {
        otherMemberSetShouldThrowException();
        this.realMember.setInterest(interest);
    }

    private void otherMemberSetShouldThrowException() {
        if(!operator.equals(realMember.getName())) {
            throw new RuntimeException("不允许修改其他会员的信息");
        }
    }

    @Override
    public String getInterest() {
        return realMember.getInterest();
    }

    @Override
    public void addFriendComment(String friendComment) {
        if(operator.equals(realMember.getName())) {
            throw new RuntimeException("自己不可以评价自己");
        }
        realMember.addFriendComment(friendComment);
    }

    @Override
    public List<String> getFriendComments() {
        return realMember.getFriendComments();
    }
}
