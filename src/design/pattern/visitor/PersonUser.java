package design.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class PersonUser implements User {
    private String name;
    private List<String> wantedJobs = new ArrayList<String>();

    public PersonUser(String name) {
        this.name = name;
        wantedJobs = asList("开发工程师", "网页设计师");
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitPersonInfo(this);
    }

    public String getPersonInfo() {
        return String.format("个人用户信息:姓名%s", name);
    }

    public String getWantedJobsInfo() {
        return String.format("%s应聘的岗位:%s", name, wantedJobs.toString());
    }
}
