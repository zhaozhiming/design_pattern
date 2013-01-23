package design.pattern.state;

public class DevState implements BugState {
    @Override
    public String handle(BugManager bugManager) {
        bugManager.setBugState(bugManager.getReviewState());
        return "缺陷已经开发完成，进入复审状态";
    }

    @Override
    public String toString() {
        return "开发状态";
    }
}
