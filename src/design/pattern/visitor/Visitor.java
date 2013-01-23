package design.pattern.visitor;

public interface Visitor {
    String visitPersonInfo(PersonUser personUser);

    String visitEnterpriseInfo(EnterpriseUser enterpriseUser);
}
