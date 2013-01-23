package design.pattern.visitor;

public class JobInfoVisitor implements Visitor {
    @Override
    public String visitPersonInfo(PersonUser personUser) {
        return personUser.getWantedJobsInfo();
    }

    @Override
    public String visitEnterpriseInfo(EnterpriseUser enterpriseUser) {
        return enterpriseUser.getVacantJobsInfo();
    }
}
