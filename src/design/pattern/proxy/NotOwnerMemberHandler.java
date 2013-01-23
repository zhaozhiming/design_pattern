package design.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NotOwnerMemberHandler implements InvocationHandler {
    private RealMember realMember;

    public NotOwnerMemberHandler(RealMember realMember) {
        this.realMember = realMember;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().startsWith("set")) {
            throw new RuntimeException("不允许修改其他会员的信息");
        }
        return method.invoke(realMember, args);
    }
}
