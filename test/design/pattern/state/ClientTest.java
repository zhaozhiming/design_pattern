package design.pattern.state;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClientTest {

    private BugManager bugManager;

    @Before
    public void setUp() throws Exception {
        bugManager = new BugManager();
    }

    @Test
    public void should_return_submit_state_when_find_bug() {
        bugManager.findBug();
        assertThat(bugManager.getCurrentBugState(), is("提交状态"));
    }

    @Test
    public void should_return_dev_state_when_submit_bug() {
        bugManager.findBug();
        String message = bugManager.submit();
        assertThat(message, is("缺陷已提交，现在是开发状态"));
        assertThat(bugManager.getCurrentBugState(), is("开发状态"));
    }

    @Test
    public void should_return_review_state_when_dev_bug() {
        bugManager.findBug();
        bugManager.submit();
        String message = bugManager.dev();
        assertThat(message, is("缺陷已经开发完成，进入复审状态"));
        assertThat(bugManager.getCurrentBugState(), is("复审状态"));
    }

    @Test
    public void should_return_dev_state_when_review_expert_opinion_is_not_yes() {
        bugManager.findBug();
        bugManager.submit();
        bugManager.dev();
        String message = bugManager.review(new Expert("代码有问题"));
        assertThat(message, is("缺陷开发有问题，回到开发状态"));
        assertThat(bugManager.getCurrentBugState(), is("开发状态"));
    }

    @Test
    public void should_return_fixed_state_when_review_expert_opinion_is_yes() {
        bugManager.findBug();
        bugManager.submit();
        bugManager.dev();
        String message = bugManager.review(new Expert("通过"));
        assertThat(message, is("缺陷修复完成，本次修改结束"));
        assertThat(bugManager.getCurrentBugState(), is("修复完成状态"));
    }
}
