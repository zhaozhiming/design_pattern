package design.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class EnterpriseUser implements User {
    private String name;
    private List<String> vacantJobs = new ArrayList<String>();

    public EnterpriseUser(String name) {
        this.name = name;
        vacantJobs = asList("测试工程师", "软件工程师");
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitEnterpriseInfo(this);
    }

    public String getEnterpriseInfo() {
        return String.format("企业用户信息:公司名%s", name);
    }

    public String getVacantJobsInfo() {
        return String.format("%s招聘的岗位:%s", name, vacantJobs.toString());
    }
}
