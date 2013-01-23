package design.pattern.proxy;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MemberBodyguardTest {
    @Test
    public void should_set_sex_when_member_owner_operator() {
        Member member = new MemberBodyguard(new RealMember("张三"), "张三");
        member.setSex("男");
        assertThat(member.getSex(), is("男"));
    }

    @Test(expected = RuntimeException.class)
    public void should_throw_exception_when_other_member_operator_sex() {
        Member member = new MemberBodyguard(new RealMember("张三"), "李四");
        member.setSex("男");
    }

    @Test
    public void should_set_interest_when_member_owner_operator() {
        Member member = new MemberBodyguard(new RealMember("张三"), "张三");
        member.setInterest("音乐");
        assertThat(member.getInterest(), is("音乐"));
    }

    @Test(expected = RuntimeException.class)
    public void should_throw_exception_when_other_member_operator_interest() {
        Member member = new MemberBodyguard(new RealMember("张三"), "李四");
        member.setInterest("音乐");
    }

    @Test
    public void should_set_friend_comment_when_other_operator() {
        Member member = new MemberBodyguard(new RealMember("张三"), "李四");
        member.addFriendComment("他是一个好人");
        assertThat(member.getFriendComments(), is(asList("他是一个好人")));
    }

    @Test(expected = RuntimeException.class)
    public void should_throw_exception_when_owner_set_friend_comment() {
        Member member = new MemberBodyguard(new RealMember("张三"), "张三");
        member.addFriendComment("他是一个好人");
    }
}
