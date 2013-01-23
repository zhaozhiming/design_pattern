package design.pattern.state;

public class SubmitState implements BugState {

    @Override
    public String toString() {
        return "提交状态";
    }

    @Override
    public String handle(BugManager bugManager) {
        bugManager.setBugState(bugManager.getDevState());
        return "缺陷已提交，现在是开发状态";
    }
}
