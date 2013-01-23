package design.pattern.visitor;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClientTest {

    private JobManager jobManager;

    @Before
    public void setUp() throws Exception {
        jobManager = new JobManager();
    }

    @Test
    public void should_visit_person_info_when_use_user_info_visitor() {
        User personUser = new PersonUser("张三");
        jobManager.addUser(personUser);
        assertThat(jobManager.getUserCount(), is(1));

        Visitor visitor = new UserInfoVisitor();
        String message = jobManager.visitUserInfo(visitor);
        assertThat(message, is("个人用户信息:姓名张三\n"));
    }

    @Test
    public void should_visit_enterprise_info_when_use_user_info_visitor() {
        User enterpriseUser = new EnterpriseUser("学云网");
        jobManager.addUser(enterpriseUser);
        assertThat(jobManager.getUserCount(), is(1));

        Visitor visitor = new UserInfoVisitor();
        String message = jobManager.visitUserInfo(visitor);
        assertThat(message, is("企业用户信息:公司名学云网\n"));
    }

    @Test
    public void should_visit_all_users_info_when_use_user_info_visitor() {
        User personUser = new PersonUser("张三");
        User enterpriseUser = new EnterpriseUser("学云网");
        jobManager.addUser(personUser);
        jobManager.addUser(enterpriseUser);
        assertThat(jobManager.getUserCount(), is(2));

        Visitor visitor = new UserInfoVisitor();
        String message = jobManager.visitUserInfo(visitor);
        assertThat(message, is("个人用户信息:姓名张三\n企业用户信息:公司名学云网\n"));
    }

    @Test
    public void should_visit_all_user_jobs_info_when_use_job_info_visitor() {
        User personUser = new PersonUser("张三");
        User enterpriseUser = new EnterpriseUser("学云网");
        jobManager.addUser(personUser);
        jobManager.addUser(enterpriseUser);
        assertThat(jobManager.getUserCount(), is(2));

        Visitor visitor = new JobInfoVisitor();
        String message = jobManager.visitUserInfo(visitor);
        assertThat(message, is("张三应聘的岗位:[开发工程师, 网页设计师]\n" +
                "学云网招聘的岗位:[测试工程师, 软件工程师]\n"));
    }
}
