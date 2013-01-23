package design.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MemberOwnerHandler implements InvocationHandler {
    private RealMember realMember;

    public MemberOwnerHandler(RealMember realMember) {
        this.realMember = realMember;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("add")) {
            throw new RuntimeException("自己不可以评价自己");
        }
        return method.invoke(realMember, args);
    }
}
