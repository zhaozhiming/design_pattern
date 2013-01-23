package design.pattern.visitor;

public class UserInfoVisitor implements Visitor {
    @Override
    public String visitPersonInfo(PersonUser personUser) {
        return personUser.getPersonInfo();
    }

    @Override
    public String visitEnterpriseInfo(EnterpriseUser enterpriseUser) {
        return enterpriseUser.getEnterpriseInfo();
    }
}


