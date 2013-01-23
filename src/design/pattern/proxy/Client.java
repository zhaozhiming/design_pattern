package design.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        RealMember realMember = new RealMember("张三");
        Member member = getProxy(realMember, new MemberOwnerHandler(realMember));
        member.setSex("男");
        System.out.println(member.getSex());

        try {
            member.addFriendComment("他是一个好人");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Member member1 = getProxy(realMember, new NotOwnerMemberHandler(realMember));
        member1.addFriendComment("他是一个好人");
        System.out.println(member1.getFriendComments());

        try {
            member1.setSex("男");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public static Member getProxy(RealMember realMember,
                           InvocationHandler invocationHandler) {
        return (Member) Proxy.newProxyInstance(
                realMember.getClass().getClassLoader(),
                realMember.getClass().getInterfaces(),
                invocationHandler);
    }
}
